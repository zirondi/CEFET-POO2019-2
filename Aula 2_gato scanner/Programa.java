import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		//Criando um novo objeto gato na variavel x


		//Scanner pra cada tipo pq o java é chato!
		
		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerStr = new Scanner(System.in);
		Gato x = new Gato();
		
		System.out.println("Insira o nome do Gato: ");
		x.nome = scannerStr.nextLine();
		System.out.println("Insira a idade do Gato: ");
		x.idade = scannerInt.nextInt();
				
		System.out.println(x.nome + " " + x.idade);	
		
		Gato y = new Gato();
		
		System.out.println("Insira o nome do Gato: ");
		y.nome = scannerStr.nextLine();
		System.out.println("Insira a idade do Gato: ");
		y.idade = scannerInt.nextInt();
		
		System.out.println(y.nome + " " + y.idade);
		scannerInt.close();
		scannerStr.close();

	}
}
