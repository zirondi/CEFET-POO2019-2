import java.util.*;

public class Aula4 {
	public static void main(String[] args) {
		/**
		String x1 = "abc";
		Aluno a = new Aluno();
		a.setNome("abc");
		//.toString implicito
		//vc pode reescrever ele
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(x1.toString());
		
		String x="abc";
		String y = new String("abc");
		String z = "abc";
		boolean b = x == y;
		boolean c = z == x;
		boolean d = x.equals(y);
		System.out.println(b);
		System.out.println(c);
		System.out.println(y);
		System.out.println(d);
		
		**/
		
		//Metodo new string -> compara objetos string alocados
		//Metodo var string -> compara a conteúdo
		// x e z apontam para o msm objeto (???)
		//Comparando metodos, avaliam endereços
		// Comparar dois objetos -> nao usar ==, usar o .equals(var comparar)
		
		/*
		Aluno xx = new Aluno();
		Aluno yy = new Aluno();
		
		xx.setNome("abc");
		yy.setNome("abc");
		
		System.out.println(xx == yy);
		System.out.println(xx.equals(yy));
		*/
		
		//equals do objeto, comparando as referencias
		//Para comparar caracters "abc".equals("abc");
		
		
		/*
		 * 1 crie uma classe chamada utils
		 * 2 crie um metodo com a assinatura:
		 * 		public static ArrayList getJubilados()
		 * 			(adicione cpf aos aluno, com get e set)
		 * 			
		 * crie uma array list com 10 alunos, retorne o array list
		 * 
		 * receba o cpf de 1 aluno do console
		 * na main use o metodo Utils.getJubilados para saber se o aluno 
		 * com o cpf recebido esta jubilado
		 * 
		 * imprima o nome e a informação do utils
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		String cpf = scanner.nextLine();
		scanner.close();
		boolean jubilado = false;
		
		ArrayList a = Utils.getJubilados();
		
		for (int i = 0; i < a.size(); i++) {


			if ( ((Aluno)a.get(i)).getCpf().equals(cpf)) {
				System.out.println("Aluno: " + ((Aluno)a.get(i)).getNome() + " CPF: " + ((Aluno)a.get(i)).getCpf() + " Estado: Jubilado");
				jubilado = true;
			}
		}
		
		if (!jubilado) {
			System.out.println("Aluno com CPF: " + cpf + " não está jubilado");
		}
		
		*/
		
		
		//A maneira certa.
		
		boolean controle = false;
		Scanner scanner = new Scanner(System.in);
		String cpf = scanner.nextLine();
		scanner.close();
		
		ArrayList x = Utils.getJubilados();
		Aluno procura = new Aluno(null, cpf);
		//O contains utiliza o .equals para descubrir se o objeto existe no ArrayList
		//Nesse caso apenas funciona pq o .equals do Aluno foi editado para comparar o cpf.
		int i = x.indexOf(procura);
		if (i >= 0) {
			
			System.out.println(x.get(i) + " Jubilado");
		}
		else {
			System.out.println(cpf + " não jubilado");
		}		
	}
}
