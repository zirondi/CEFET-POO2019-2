import java.io.*;

public class FormatoIncorretoException extends Exception implements Serializable{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormatoIncorretoException(String errorMessage) {
		super(errorMessage);
	}
}
