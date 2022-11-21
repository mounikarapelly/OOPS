package encapsulation;

import java.util.Scanner;

public class Encapsulation2 {
		void display() {
			Encapsulation obj = new Encapsulation();
			//scanner cls is used to accept data from the user at runtime
			Scanner sc = new Scanner(System.in);//creating object for scanner class
			System.out.println("enter your rollnumber");
			obj.setRollNumber(sc.nextInt());//use pre defined methods in the scanner to take input vale
			System.out.println("enter your name");
			obj.setName(sc.next());
			System.out.println("rollnumber==>"+obj.getRollNumber());
			System.out.println("name===>"+obj.getName());
			
		}

		public static void main(String[] args) {
			Encapsulation2 obj2 = new Encapsulation2();
			//new Encapsulation.display();
			obj2.display();

		}

}
