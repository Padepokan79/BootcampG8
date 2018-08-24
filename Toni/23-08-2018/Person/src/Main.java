
public class Main {
	public static void main(String[] args) {
		int[] cx = {6, 7}, lx = {8, 7};
		Worker headMaster = new Worker(001, "James Callahan", 51, "Male", "Headmaster");
		Teacher teacher1 = new Teacher(002, "Monica Truman", 33, "Female", "Teacher", "Physics");
		Student student1 = new Student(003, "Tim Brosnan", 18, "Male", "XII A");
		Committee kesiswaan = new Committee(003, "Tim Brosnan", 18, "Male", "Committee", "Kesiswaan");
		
		Classroom classX = new Classroom(002, "Class 002", "XII A", 45, cx, "Good");
		Labolatory labX = new Labolatory(202, "Lab 202", "Chemistry", 45, lx, "Good");
		
		headMaster.tampil();
		teacher1.tampil();
		student1.tampil();
		kesiswaan.tampil();
		
		System.out.println(classX.deskripsi());
		System.out.println(labX.deskripsi());
	}
}
