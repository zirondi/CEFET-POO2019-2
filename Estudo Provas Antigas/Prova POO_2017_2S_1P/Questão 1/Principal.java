import java.util.*;

public class Principal {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		abrevia(nome);
		scanner.close();
	}
	
	public static void abrevia(String nome) {
		String[] nomeArr = nome.split(" ");
		for(int i=0; i< nomeArr.length; i++) {
			if(((String)nomeArr[i]).length() > 2) {
				System.out.print(((String)nomeArr[i]).charAt(0) + ". ");
			} else {
				System.out.print(((String)nomeArr[i]) + " ");
			}
		}
		System.out.println();
		
	}
}
