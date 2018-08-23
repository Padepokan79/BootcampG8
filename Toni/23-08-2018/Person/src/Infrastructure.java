
public class Infrastructure extends Property{
	int capacity;
	int[] dimension = new int[2];
	
	Infrastructure(int id, String name, int capacity, int[] dimension, String condition){
		super(id, name, condition);
		this.dimension = dimension;
		this.capacity = capacity;
	}
	
	int size() { return dimension[0] * dimension[1]; }
	
	String deskripsi() {
		return super.deskripsi()+"\nSize : "+this.size()+"\nCapacity : "+capacity;
	}
}
