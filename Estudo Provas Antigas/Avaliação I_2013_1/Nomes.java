/**
Crie	 um	 sistema	 que	 receba	 do	 console	 nomes	 de	 pessoas	 at�	 ser	 digitado	 a String	 �sair�.	
Enquanto	 o	 usu�rio	 n�o	 digitar	 �sair�,	 o	 sistema	 insere	 as	 Strings	 (nomes	 de pessoas)	 em	 uma	
lista.	

Quando	o usu�rio	digitar	�sair�,	imprime	no	console o	tamanho	da	lista	(imprima	o	total	a	
partir	 da	 lista,	 n�o	 crie	 nenhuma	 vari�vel	 para	 contar) e	 imprime	 o	 n�mero	 de	 Strings	 iguais	
dentro	da	lista	(ex:	se	o	usu�rio	inseriu	�Albert	Einstein�	na	primeira	posi��o	e	na	10	posi��o,	
temos	 uma	 String	 igual).

 Fa�a	 essa	 verifica��o (Strings	 iguais	 na	 lista) em	 um	 m�todo	 separado,	
que	recebe	uma	lista	e	retorna	um	int	representando	o	n�mero	de	Strings	iguais.
 */

import java.util.*;

public class Nomes {
	public static void addNomes() {
		List ListaNomes = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		String Nome = scanner.nextLine();
		while(!Nome.equals("sair")) {
			ListaNomes.add(Nome);
			Nome = scanner.nextLine();
		}
		scanner.close();
		System.out.println("O tamanho da lista � de " + ListaNomes.size() + " elementos");
		System.out.println("O n�mero de nomes iguais na lista � de " + Nomes.iguais(ListaNomes));
		
		
	}
	
	private static int iguais(List ListaNomes){
		
		int iguais = 0;
		
		for(int i=0; i < ListaNomes.size(); i++) {
			String nome = ListaNomes.get(i).toString();
			ListaNomes.remove(i);	
		
			if(ListaNomes.contains(nome)) {
				iguais++;
				int indexNome = ListaNomes.indexOf(nome);
				ListaNomes.remove(indexNome);
			}
		}		
			
		return iguais;
	}
}
