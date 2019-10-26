import java.util.*;

/*
		 * Dado um mapa m2 que possua palavras como chaves, hashsets de classes gramaticais como valores
		 * exiba todas as palavras que possuem classe gramatical [ADJ]
		 * 
		 * A -> artigo/preposição
		 * gosto -> verbo/nome
		 * bonita -> adjetiva
		 * Legal -> adj
		 * 
		 * m.get(algo nao no mapa) retorna null
		 */
public class Principal {
	public static void exiba(Map<String, HashSet<String>> m) {
		for(String s: m.keySet()) {
			if(m.get(s).contains("Adjetivo")){
				System.out.println(s);
			}
		}
	}
	public static void exibaGustavo(Map <String, HashSet<String>> m) {
		Iterator<String> it = m.keySet().iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(m.get(str).contains("Adjetivo")) {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String [] args) {
		HashSet<String> gramatica = new HashSet<String>();
		//gramatica.add("Artigo");
		//gramatica.add("Preposição");
		//gramatica.add("Verbo");
		//gramatica.add("Substantivo");
		
		Map<String, HashSet<String>> m2 = new HashMap<String, HashSet<String>>();
		
		m2.put("a", new HashSet<String>(Arrays.asList("Artigo", "Preposição")));
		m2.put("Gosto", new HashSet<String>(Arrays.asList("Verbo", "Substantivo")));
		m2.put("Bonito", new HashSet<String>(Arrays.asList("Adjetivo")));
		m2.put("Gosto", new HashSet<String>(Arrays.asList("Adjetivo")));
		
		exiba(m2);
		exibaGustavo(m2);
		
	}
}



