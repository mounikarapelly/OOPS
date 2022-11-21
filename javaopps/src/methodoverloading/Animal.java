package methodoverloading;

public class Animal {
		public static void cat() {
			System.out.println("cat method exected"+10);
			
			
		}
		public int  cat(int a) {
			System.out.println("cat sounds meow meow"+20);
			return a ;
			
		}
		
	
	public static void main(String[] args) {
		Animal obj = new Animal();
		
		obj.cat();
		obj.cat(100);

	}

}
