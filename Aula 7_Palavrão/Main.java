/*
 * Crie um programa que receba do console uma frase e verifique se há algum palavrão.
 * Caso haja, imprima "A frase inserida possui os seguintes palavrões: " x, y, z
 * 
 * Considere que o usuário pode inserir o palavrão em caixa alta, baixa, etc
 */


//Comparar strings com == na prova -0.5

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String frase = scanner.nextLine();
		 scanner.close();
		 
		 Palavrao.achaPalavrao(frase);
		 Palavrao.achaPalavraRedux(frase);

	}

}
