import java.util.*;

public class Principal {
	public static void main(String[] args) {
		//3a
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Scanner scanner = new Scanner(System.in);
		Livro livro1 = new Livro(scanner.nextLine());
		Livro livro2 = new Livro(scanner.nextLine());
		Livro livro3 = new Livro(scanner.nextLine());
		
		carrinho.setList(livro1);
		carrinho.setList(livro2);
		carrinho.setList(livro3);
		
		
		
		scanner.close();
		
	}
}
