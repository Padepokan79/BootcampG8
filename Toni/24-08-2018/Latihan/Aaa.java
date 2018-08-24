public class Aaa {
   // A private variable named xxx of the type T
   private T xxx;
 
   // Constructor
   public Aaa(T xxx) {
      this.xxx = xxx;
   }
 
   // A getter for variable xxx of type T receives no argument and return a value of type T
   public T getXxx() {
      return xxx;  // or "return this.xxx" for clarity
   }
 
   // A setter for variable xxx of type T receives a parameter of type T and return void
   public void setXxx(T xxx) {
      this.xxx = xxx;
   }
}
