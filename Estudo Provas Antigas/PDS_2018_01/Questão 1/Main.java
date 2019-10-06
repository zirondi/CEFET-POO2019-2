import java.util.*;

public class Main {
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o id do Biscoito: ");
		String id = scanner.nextLine();
		scanner.close();
		
		List <Object> x = Utils2.getList();
		Biscoito y = new Biscoito(id);
		
		if (Utils.existe(x, y)) {
			System.out.println("O biscoito existe na lista!");
			Biscoito temp = (Biscoito)x.get(x.indexOf(y));
			System.out.println("ID: " + temp.getClass());
			System.out.println("Cor: " + temp.getCor());
			System.out.println("Preço: " + temp.getPreco());		
		}		
	}
	
	public static Biscoito[] transformaListEmArray(List<Object> k) {
		/**
		Biscoito [] array = new Biscoito[1];
		for(int i = 0; i < k.size(); i++) {
			if (k.get(i) instanceof Biscoito) {
				System.out.println("if");
				array[array.length - 1] = (Biscoito)k.get(i);
				if (!((i+1) == k.size())) {
					Biscoito[] temp = new Biscoito[array.length + 1];
					System.arraycopy(array, 0, temp, 0, array.length);
					array = new Biscoito[temp.length];
					System.arraycopy(temp, 0, array, 0, array.length);
				}
			}
		}
		
		**/
		
		List<Object> temp = new ArrayList<Object>();
		
		for(int i=0; i < k.size(); i++) {
			if (k.get(i) instanceof Biscoito) {
				Biscoito y = (Biscoito)k.get(i);
				temp.add(y);
			}
		}
		
		Biscoito[] array = new Biscoito[temp.size()];
		
		array = (Biscoito[]) temp.toArray();
		
		return array;		
	}

	public static void calculaPreco(Biscoito[] array) {
		int total =0;
		for(int i=0; i < array.length; i++) {
			total = total + array[i].getPreco();
		}
		System.out.println("O total foi de: " + total);
	}

}