import java.util.*;

public class Principal {
	public static void main(String [] args) {
		ArrayList<Object> y = new ArrayList<Object>();
		
		
		y.add(new ArrayList<Object>());
		y.add("ABC");
		
		//hmm
		y.add(15);
		
		int i = 10;
		y.add(i);
		System.out.println(y.get(3));
		
		int u = ((Integer)y.get(3));
		System.out.println(u);
		
		y.add('a');
		y.add(true);
		
		for(int f = 0; f < y.size(); f++) {
			System.out.println(y.get(f).getClass());
		}
		
		
		//Arraylist de objetos
		//y.get(0).add("DEF");
		
		((ArrayList<Object>)y.get(0)).add("DEF");
		
		System.out.println();
		
		Integer x = Integer.valueOf(15);
		
		//
		
		ArrayList<String> k = new ArrayList<String>();
		
		k.add("ABC");
		k.add("DEF");
		
		for (int j = 0; j < k.size(); j++) {
			System.out.println(k.get(j).length());
		}
		
		//Usando iterator
		
		Iterator <String> it = k.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//
		ArrayList<Animal> l = new ArrayList<Animal>();
		l.add(new Leao());
		l.add(new Urso());
		
		//15 (Erro de execução no casting do for) ai faz o generics e erro de compilação
		ArrayList<Double> o = new ArrayList<Double>();
		o.add(15.0);
		o.add(18.3);
		
		double media = 0;
		
		for (int p = 0; p < o.size(); p++) {
			double d = o.get(p);
			media += d;
		}
		
		System.out.println(media/o.size());
		
		//
		/**
		 * Dado um mapa m2 que possua palavras como chaves, hashsets de classes gramaticais como valores
		 * exiba todas as palavras que possuem classe gramatical [ADJ]
		 * 
		 * A -> artigo/preposição
		 * gosto -> verbo/nome
		 * bonita -> adjetiva
		 * Legal -> adj
		 */
		
		Set <String> q = new HashSet<String>();
		Map<String, Animal> m = new HashMap<String, Animal>();
		Map<String, HashSet<String>> m2 = new HashMap <String, HashSet<String>>();
				
		
	}

}
