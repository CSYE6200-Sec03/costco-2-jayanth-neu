package edu.neu.csye6200;

public class Midterm {
	/**
	 * Student TODO:
	 * complete the implementation of the required methods in demo()
	 * called here by Driver main() method
	 * 
	 * @param args
	 */
	public static void demo() {
		System.out.println(Midterm.class.getName() + ".main()...");
		
		Midterm obj = new Midterm();
		obj.demoAbstraction();		// Student TODO implementation
		obj.demoEncapsulation();	// Student TODO implementation
		obj.demoInheritance();		// Student TODO implementation
		obj.demoPolymorphism();		// Student TODO implementation
		obj.demoStaticData();		// Student TODO implementation
		obj.demoImmutableData();	// Student TODO implementation
		
		Costco.demo();	// demonstrate Costco app
		
		System.out.println("\n" + Midterm.class.getName() + ".main()... done!");
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Abstraction
	 * BOTH
	 * a. data hiding
	 * b. functionality hiding
	 */
	public void demoAbstraction() {
		System.out.println("\n\t demoAbstraction...\n");
		/**
		 * Student TODO: complete implementation
		 */
		
		//a. data hiding
		Durable d = new Durable();
		System.out.println(d.getWeight()); //Making the data members private and accessing them with public methods of the same class
		
		//b. functionality hiding
		Object o = new Costco();
		System.out.println(o.toString()); //Hiding the toString() implementation of Object class using toString() implementation of Costco class
	}	
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Encapsulation
	 */
	public void demoEncapsulation() {
		System.out.println("\n\t demoEncapsulation...\n");
		/**
		 * Student TODO: complete implementation
		 */
		//Encapsulation
		Durable d = new Durable();
		System.out.println(d.getWeight()); //Making the data members private and accessing them with public methods of the same class
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Inheritance
	 */
	public void demoInheritance() {
		System.out.println("\n\t demoInheritance...\n");
		/**
		 * Student TODO: complete implementation
		 */
		//Inheritance
		Durable d = new Durable();
		System.out.println(d.getId()); 
		// getId() is originally in ItemAPI class, but we are able to access it through Durable class using inheritance 
		//i.e., Durable class inheriting properties of ItemAPI class
		
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the Object Oriented Principle of Polymorphism
	 */
	public void demoPolymorphism() {
		System.out.println("\n\t demoPolymorphism...\n");
		/**
		 * Student TODO: complete implementation
		 */
		//Compiletime polymorphism
		System.out.println("Compiletime polymorphism");
		Costco c = new Costco();
		// call methods of same name but they differ in parameters
		c.staticPolyDemo(0);
		c.staticPolyDemo(0, 0);
		
		//Runtime polymorphism
		System.out.println("\nRuntime polymorphism");
		Object o = new Costco();
		System.out.println(o.toString()); 
		//Overriding the toString() implementation of Object class using toString() implementation of Costco class during runtime i.e. dynamic polymorphism
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the use of static data
	 */
	@SuppressWarnings("static-access")
	public void demoStaticData() {
		System.out.println("\n\t demoStaticData...\n");
		/**
		 * Student TODO: complete implementation
		 */
		//static data
		Costco c1 = new Costco();
		c1.setDemoVariable(30); //data member is set using the c1 object
		Costco c2 = new Costco();
		System.out.println(c2.getDemoVariable()); // reading the data member using c2 object
		System.out.println(Costco.getDemoVariable()); // reading the data member using classname directly
		//We can see that static data members don't require an object for accessing them, they can be accessed directly through classname
		//they always maintain the same value across various instances
	}
	/**
	 * Student TODO:
	 * using this class, demonstrate the use of immutable data
	 */
	public void demoImmutableData() {
		System.out.println("\n\t demoImmutableData...\n");
		/**
		 * Student TODO: complete implementation
		 */
		//immutable data
		Costco c1 = new Costco();
		System.out.println(c1.getImmutableVariable()); //we can't change value of final variable, we can only read them
	}
}
