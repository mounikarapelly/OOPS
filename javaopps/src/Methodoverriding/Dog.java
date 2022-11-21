package Methodoverriding;

public class Dog  extends Animal{

	
		  public void animalSound() {
		    System.out.println("The dog says: bow wow");
		  }
		

		
		  public static void main(String[] args) {
		    Animal myAnimal = new Animal();  // Create a Animal object
		    Animal myPig = new Cat();  // Create a Cat object
		    Animal myDog = new Dog();  // Create a Dog object
		    myAnimal.animalSound();
		    myPig.animalSound();
		    myDog.animalSound();
		    
		  }
		  
		

}
		  
