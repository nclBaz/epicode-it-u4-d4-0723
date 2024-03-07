import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {

		Animal animal = new Animal("Nome", 20);
		animal.sayYourName();
		animal.walk();
		System.out.println(animal);

		Dog fido = new Dog("Fido", 10);
		fido.sayYourName();
		fido.walk();
		System.out.println(fido);

		Cat felix = new Cat("Felix", 4, true);
		felix.sayYourName();
		felix.walk();
		felix.walk(100);
		felix.meow();
		System.out.println(felix);
	}
}