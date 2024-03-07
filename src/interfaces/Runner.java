package interfaces;

public interface Runner {
	// L'interfaccia è una sorta di "contratto" che stabilisce che chiunque implementi tale interfaccia,
	// sarà costretto a possedere ed implementare i metodi definiti all'interno di essa.
	// In questo caso chiunque implementi l'interfaccia ci garantirà la presenza del metodo run()
	public void run();
}
