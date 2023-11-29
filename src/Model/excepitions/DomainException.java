package Model.excepitions;

public class DomainException extends RuntimeException{

	// classes que são serializable os objetos dessa classe podem ser convertidos para bytes
	// e assim trafegar em redes, ser gravados em arquivos, etc.

	private static final long serialVersionUID = 1L;
	
	public DomainException( String msg) {
		super(msg);// permite que possa instanciar a exceção personalizada
	}
	
}
