import java.util.*;

public class Palavrao {
	private static List getPalavroes() {
		ArrayList ListaPalavroes = new ArrayList();
		ListaPalavroes.add("caramba");
		ListaPalavroes.add("edson");
		ListaPalavroes.add("carambolas");
		ListaPalavroes.add("caraca");
		return ListaPalavroes;	
	}
	
	public static void achaPalavrao(String frase) {
		String fraseAr [] = frase.split(" ");
		fraseAr = Palavrao.trimIt(fraseAr);
		
		ArrayList palavroes = (ArrayList)Palavrao.getPalavroes();
		ArrayList palavroesAchados = new ArrayList();
		
		for(int i = 0; i < fraseAr.length; i++)
		{
			if(palavroes.contains(fraseAr[i].toLowerCase())) {
				palavroesAchados.add(fraseAr[i]);
			}
		}
		
		System.out.println("A frase inserida possui os seguintes palavrões: ");
		System.out.println(palavroesAchados);
	}
	
	private static String [] trimIt(String [] x) {
		for(int i = 0; i < x.length; i++) {
			x[i] = x[i].trim();
		}
		return x;
	}
	
	public static void achaPalavraRedux(String frase) {
		ArrayList palavroes = (ArrayList)Palavrao.getPalavroes();
		ArrayList palavroesAchados = new ArrayList();
		
		ArrayList fraseAL = new ArrayList();
		
		fraseAL.add(frase);
		
		palavroes.removeAll(fraseAL);
		
		System.out.println(palavroes);
		
		
		
		

		}
	}
