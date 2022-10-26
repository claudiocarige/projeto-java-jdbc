package db;

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	//Força o construtor a repassar a msg para classe Pai (RuntimeException)
	public DbIntegrityException(String msg) {
		super(msg);
	}

}
