/*
 * a.Crie a classe Livrocom dois atributos seguindo o padrão dado em sala: nome (String) e quantidade (int). Crie os getters e setters.

b.Em seguida, crie uma classe Principal que cadastre o nome do livro e quantas unidades foram  vendidas.  Você  deve  representar  a  estrutura  que  irá  guardar  os  livros  como  um array.  Você  deve  solicitar  ao  usuário  para  inserir  o  nome  e  a  quantidade  (recebendo entrada do teclado).

c.Na  classe  Principal, crie  um  método chamado  ordenarMaisVendidos  que  receba  como argumento um arrayde Livros. Retorne um novo arrayordenado. 

d.Ainda na classe Principal, imprima na saída padrão o nome e a quantidade do livro mais vendido.e.Quando o usuário digitar “sair”,o programadeve imprimir no console o total de livros vendidos e o nome do livro mais vendido. Em seguida, o sistema termina.
 */
import java.util.*;



public class Principal {
		
	public static Livro[] ordenarMaisVendidos(Livro[] array) {
		Arrays.sort(array);
		return array;
	}
	

	
	public static void main(String args[]) {
		Livro [] Livros = new Livro[1];
		Livros[0] = new Livro();
		boolean marcador = false;

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Nome do Livro: ");
		String nome = scanner.nextLine();
	
		
		while(!nome.equals("sair")) {
			
			if(marcador) {
				Livro[] temp = new Livro[(Livros.length + 1)];
				System.arraycopy(Livros, 0, temp, 0, Livros.length);
				Livros = new Livro[temp.length];
				System.arraycopy(temp, 0, Livros, 0, temp.length);
				Livros[(Livros.length - 1)] = new Livro();
			}
			
			System.out.println(Livros.length);
			Livros[(Livros.length - 1)].setNome(nome);
			
			System.out.println("Digite a quantidade de Livros: ");
			Livros[(Livros.length - 1)].setQuantidade(scanner.nextInt());
	
			System.out.println("Livro adicionado com sucesso!");
			scanner.nextLine();
			marcador = true;
			
			
			System.out.println("Digite o nome do Livro: ");			
			nome = scanner.nextLine();
		}				
		scanner.close();
		
		Livros = Principal.ordenarMaisVendidos(Livros);
		
		System.out.println(Livros[(Livros.length - 1)]);
		
		ordenarMaisVendidos(Livros);
		
		System.out.println(Livros[0].getNome());
		System.out.println(Livros[2].getNome());
		
		
		//System.out.println("O livro mais vendido foi " + mais.getNome() + " que vendeu " +  mais.getQuantidade() + " Livros no total");
		
	}

}
