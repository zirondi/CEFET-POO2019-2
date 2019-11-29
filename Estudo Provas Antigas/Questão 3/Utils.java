import java.util.*;

public class Utils {
	public static void metodo(CarrinhoDeCompras carrinhos) {
		List<String> tempLivros = new ArrayList<String>();
		List<Object> tempObjects = new ArrayList<Object>();
		List<Object> listaCarrinho = carrinhos.getList();
		
		for(int i=0; i < listaCarrinho.size(); i++) {
			if(listaCarrinho.get(i) instanceof Livro) {
				String check = ((Livro)listaCarrinho.get(i)).getId();
				if(!tempLivros.contains(check)){
					int freq = Collections.frequency(listaCarrinho, listaCarrinho.get(i));
					System.out.println(check + " - " + freq);
					tempLivros.add(check);
				}
			} else {
				Object o = listaCarrinho.get(i);
				if(!tempObjects.contains(o)){
					int freq = Collections.frequency(listaCarrinho, listaCarrinho.get(i));
					System.out.println(o.toString() + " - " + freq);
					tempObjects.add(o);
				}
			}
		}
	}
}
