package entities;

import interfaces.Runner;

public class Dog extends Animal implements Runner {

	// Eredito name, age dal padre
	public Dog(String name, int age) {
		super(name, age); // Con super richiamiamo il costruttore del padre
	}

	@Override
	public void getInfo() {
		System.out.println("Sono un cane BAU");
	}

	// Eredito anche i metodi dal padre
	// walk()
	// sayHello()

	public void bark() {
		System.out.println("BAU!");
	}

	@Override
	public void run() {
		System.out.println("Sono un cane e sto correndo");
	}
}
