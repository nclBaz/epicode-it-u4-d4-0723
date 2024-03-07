package entities;

import interfaces.Jumper;

public class Cat extends Animal implements Jumper {
	// Eredito name,age dal padre
	// In più posso aggiungere ulteriori attributi
	private boolean hasBoots;

	public Cat(String name, int age) {
		super(name, age);
		this.hasBoots = false;
	}

	public Cat(String name, int age, boolean hasBoots) { // OVERLOAD del costruttore
		this(name, age);
		this.hasBoots = hasBoots;
	}

	// Metodi nuovi
	public void meow() {
		System.out.println("MEOW!");
	}

	@Override
	public void walk() {
		System.out.println("---------------");
		//super.walk(); // posso EVENTUALMENTE chiamare anche il metodo del padre
		System.out.println("Sono un GATTO e sto camminando");
	}

	public void walk(int numeroPassi) { // OVERLOAD di walk()
		this.walk();
		System.out.println("Camminerò per " + numeroPassi + " passi");
	}

	@Override
	public String toString() {
		return "Cat{" +
				"hasBoots=" + hasBoots +
				", name='" + name + '\'' +
				", age=" + age +
				"} ";
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao le mie info sono: " + this.name + ", " + this.age + ", " + this.hasBoots);
	}

	@Override
	public void jump() {
		System.out.println("Sono un gatto e sto saltando");
	}
}
