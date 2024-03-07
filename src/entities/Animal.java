package entities;

import java.util.Objects;

public abstract class Animal {
	// Abstract <-- non si potranno creare oggetti Animal
	// Ma questa classe comunque è utile come fornitrice di proprietà e funzionalità
	// Per le figlie

	// Attributi
	protected String name;
	protected int age;

	// Costruttori
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Metodi
	public void sayYourName() {
		System.out.println("Ciao sono un animale e il mio nome è: " + this.name);
	}

	public void walk() {
		System.out.println("Ciao sono un animale e sto camminando");
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o;
		return age == animal.age && Objects.equals(name, animal.name);
	}

	// Metodi Astratti
	public abstract void getInfo();
	// Un metodo astratto serve per forzare i figli ad avere
	// questo metodo implementato
	// Lo implementeranno a loro discrezione, non è il padre
	// a definire che cosa fa questo metodo
}
