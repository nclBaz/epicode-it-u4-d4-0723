import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;

public class Main {
	public static void main(String[] args) {

/*		Animal animal = new Animal("Nome", 20);
		animal.sayYourName();
		animal.walk();
		System.out.println(animal);*/

		Dog fido = new Dog("Fido", 10);
		fido.sayYourName();
		fido.walk();
		System.out.println(fido);

		Cat felix = new Cat("Felix", 4, true);
		felix.sayYourName(); // è ereditato
		felix.walk(); // è ereditato ma overridato
		felix.walk(100); // è un overload di walk()
		felix.meow(); // non è ereditato ma è un metodo nuovo
		System.out.println(felix);

		fido.getInfo();
		felix.getInfo();

		System.out.println("********************************** POLIMORFISMO ***********************************");
		Student aldo = new Student("Aldo", "Baglio");

		Animal[] animals = {fido, felix, new Dog("Rintintin", 5), new Cat("Tom", 2)};
		// Dog[] dogs = {fido, felix};

		for (int i = 0; i < animals.length; i++) {
			Animal currentAnimal = animals[i];
			currentAnimal.getInfo();

			if (currentAnimal instanceof Dog) { // Controllo se l'elemento corrente dell'array è un DOG
				((Dog) currentAnimal).bark(); // Non basta controllare se currentAnimal è anche un Dog, devo per forza convertirlo (cast) se voglio usarne i metodi
			} else {
				System.out.println("Non sono un cane quindi non posso abbaiare");
				((Cat) currentAnimal).meow();
			}
		}
	}
}