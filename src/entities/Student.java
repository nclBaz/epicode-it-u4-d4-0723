package entities;

import java.util.Objects;
import java.util.Random;

public class Student {

	public static String school = "Epicode";
	// LISTA ATTRIBUTI
	private int id;
	private String name;
	private String surname;

	private TipoStudent tipo;

	// LISTA COSTRUTTORI
	// Se non dichiaro nessun costruttore, ci sarà sempre e comunque
	// già il costruttore vuoto come default

	// I COSTRUTTORE
	public Student() {
		Random rndm = new Random();
		this.name = "NOME DI DEFAULT";
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
		this.tipo = TipoStudent.FULLSTACK;
	}

	// II COSTRUTTORE
	public Student(String name) {
		Random rndm = new Random();
		this.name = name;
		this.surname = "COGNOME DI DEFAULT";
		this.id = rndm.nextInt(1, 10000);
		this.tipo = TipoStudent.FULLSTACK;
	}

	// III COSTRUTTORE
	public Student(String name, String surname) {
		Random rndm = new Random();
		this.setName(name);
		this.setSurname(surname);
		this.id = rndm.nextInt(1, 10000);
		this.tipo = TipoStudent.FULLSTACK;
	}

	// IV COSTRUTTORE
	public Student(String name, String surname, TipoStudent tipo) {
		this(name, surname);
		this.tipo = tipo;
	}

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			System.err.println("Il nome deve essere più lungo di 2 caratteri");
		} else {
			this.name = name;
		}
	}

	// Posso decidere arbitrariamente di non avere determinati setters
	// se non voglio dare la possibilità di sovrascrivere un attributo
/*	public void setId(int id) {
		this.id = id;
	}*/

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public TipoStudent getTipo() {
		return tipo;
	}

	public void setTipo(TipoStudent tipo) {
		this.tipo = tipo;
	}

	// LISTA METODI
	private void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname + ", ID: " + this.id);
	}


	// To String e Equals sono metodi di default che tutti gli oggetti possiedono alla loro creazione
	// Spessissimo però non mi vanno bene questi comportamenti
	// Di default il toString mi stampa cose tipo entities.Student@1b28cdfa e allora lo voglio customizzare
	// Di default l'equals mi ritorna true solo se 2 oggetti sono nella stessa cella di memoria, però
	// non è detto che ciò mi vada bene, magari vorrei fare un controllo del tipo: se hanno gli stessi
	// valori allora equals mi deve tornare true. E allora sovrascrivo anch'esso

	// Per far generare questi 2 metodi a Intellij basta fare tasto dx --> Generate


	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", tipo=" + tipo +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true; // Se i 2 oggetti rappresentano la stessa cella di memoria allora torna true
		if (o == null || getClass() != o.getClass())
			return false; // Se o è null oppure se appartengono a classi diverse ritorna false
		Student student = (Student) o; // casting esplicito
		return this.id == student.id && Objects.equals(this.name, student.name) && Objects.equals(this.surname, student.surname);
	}
}
