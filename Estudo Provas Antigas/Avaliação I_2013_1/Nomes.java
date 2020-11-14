/**
Crie	 um	 sistema	 que	 receba	 do	 console	 nomes	 de	 pessoas	 até	 ser	 digitado	 a String	 “sair“.	
Enquanto	 o	 usuário	 não	 digitar	 “sair“,	 o	 sistema	 insere	 as	 Strings	 (nomes	 de pessoas)	 em	 uma	
lista.	

Quando	o usuário	digitar	“sair“,	imprime	no	console o	tamanho	da	lista	(imprima	o	total	a	
partir	 da	 lista,	 não	 crie	 nenhuma	 variável	 para	 contar) e	 imprime	 o	 número	 de	 Strings	 iguais	
dentro	da	lista	(ex:	se	o	usuário	inseriu	“Albert	Einstein“	na	primeira	posição	e	na	10	posição,	
temos	 uma	 String	 igual).

 Faça	 essa	 verificação (Strings	 iguais	 na	 lista) em	 um	 método	 separado,	
que	recebe	uma	lista	e	retorna	um	int	representando	o	número	de	Strings	iguais.
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
		System.out.println("O tamanho da lista é de " + ListaNomes.size() + " elementos");
		System.out.println("O número de nomes iguais na lista é de " + Nomes.iguais(ListaNomes));
		
		
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
