interface Animal {
	  int a =10;         //Defoult in public
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}

	// Pig "implements" the Animal interface
	class Pig implements Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	    
	  }
	}
