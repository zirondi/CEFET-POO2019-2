
public class Programa {
	public static void main(String[] args) {
		//Criando um novo objeto gato na variavel x
		Gato x = new Gato();
		x.nome = "Felix";
		x.idade = 9;
		
		Gato y = new Gato();
		y.nome = "Gordo";
		y.idade = 5;
		
		System.out.println(x.nome + " " + x.idade);
		System.out.println(y.nome + " " + y.idade);
	}
}
