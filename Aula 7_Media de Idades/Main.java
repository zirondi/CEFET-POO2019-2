import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		
		x.add("Leandro#21");
		x.add("Edson#20");
		x.add("Lucca#20");
		
		System.out.println(Media.getMedia(x));
		System.out.println(Media.MediaGustavo(x));

	}

	
	
	
}

/**
 * "".toLowerCase(); não edita a str, apenas retorna ela em lowercase
 * 
 * "".trim() remove os espaços no inicio e no fim da str
 */
