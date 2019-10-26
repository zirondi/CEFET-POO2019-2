//Pegar as 3 maiores notas
import java.util.*;


public class Principal {
	public static void main(String args[]){
		List x = new ArrayList();
		x.add("Joana");
		x.add("Erika");
		x.add("Luana");
		x.add("Amanda");
		System.out.println(x);
		Collections.sort(x);
		System.out.println(x);
		Collections.reverse(x);
		
		
		List y = new ArrayList();
		y.add(new Aluno("Joana", 7.3));
		y.add(new Aluno("Erica", 6.3));
		y.add(new Aluno("Erica", 8.0));
		y.add(new Aluno("Erika", 6.3));
		y.add(new Aluno("Luana", 8.1));
		y.add(new Aluno("Amanda", 3.2));
		y.add(new Aluno("Edson", 6.3));
		

		System.out.println(y);
		Collections.sort(y);
		System.out.println(y);
		
		System.out.println();
		
		for(int i = 0; i < y.size(); i++) {
			System.out.println(((Aluno)y.get(i)).getNome() + " " + ((Aluno)y.get(i)).getNota());
		}
		
		//System.out.println("Erika".compareTo("Erica"));
		//System.out.println("Erica".compareTo("Erika"));
		
		System.out.println();
		
		//Imprimindo as 3 maiores notas
		Collections.reverse(y);
		for(int i = 0; i < 3; i++) {
			System.out.println(((Aluno)y.get(i)).getNome() + " " + ((Aluno)y.get(i)).getNota());
		}
		System.out.println();
		
		//Aluno precisa ser serializavel
		Utils.persistir(y, "Alunos.ser");
		
		List z = (ArrayList) Utils.ler("Alunos.ser");
		
		System.out.println("Nova Lista!");
		for(int i = 0; i < y.size(); i++) {
			System.out.println(((Aluno)z.get(i)).getNome() + " " + ((Aluno)z.get(i)).getNota());
		}
		
		
		
		//Tem que reescrever o equals mas nao ta funfando direito
		//System.out.println(Collections.frequency(y, "Erica"));
		
		//Collections.shuffle();
		//Collections.copy();
		//Collections.disjoint();
	}
}
