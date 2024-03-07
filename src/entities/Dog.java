package entities;

public class Dog extends Animal {

	// Eredito name, age dal padre
	public Dog(String name, int age) {
		super(name, age); // Con super richiamiamo il costruttore del padre
	}

	// Eredito anche i metodi dal padre
	// walk()
	// sayHello()

	public void bark() {
		System.out.println("BAU!");
	}
}
