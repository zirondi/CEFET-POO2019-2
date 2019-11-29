import java.util.*;

public class Principal {
	public static void main(String args[]) throws FormatoIncorretoException {
		Set<String> x = new HashSet<String>();
		x.add("1234#fulano#idade#f");
		x.add("5678#beltrano#idade#j");
		x.add("9101112#cicrano#idade#f");
		x.add("13141516#fulana#idade#j");
		
		Map<String, Pessoa> y = Utils.retornaDados(x);
		
		System.out.println(y.toString());
		
		
	}
	

	
}
