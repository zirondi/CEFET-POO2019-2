
public class Aula3 {
	public static void main(String[] args) {
		/**
		int [] x = new int [3];
		x[0] = 34;
		x[1] = 7;
		for(int i=0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		**/
		
		/**
		String y[] = new String [3];
		y[0] = "casa";
		y[1] = "bola";
		y[2] = "mesa";
		
		for(int i=0; i<y.length; i++) {
			System.out.println(y[i]);
		}
		**/
		
		Carro z[] = new Carro [3];
		z[0] = new Carro();
		z[0].ano = 1998;
		z[0].cor = "Vermelho";
		z[1] = new Carro();
		z[1].ano = 2002;
		z[1].cor = "Preto";
		z[2] = new Carro();
		z[2].ano = 2016;
		z[2].cor = "Verde";
		
		for(int i=0; i<z.length; i++) {
			System.out.println("Ano: " + z[i].ano);
			System.out.println("Cor: " + z[i].cor);
		}
		
	}
}

//questão de prova: calcular a média dos numreos do arry, ordene o array, inverta a posição do array

//Erros comuns, nao definir o tamanho, usar a palavra array,

//metodo aumentar array se preciso (metodo, retornar o array com + 3 espaços)

//usar .length

//Criar um array de objetos nao cria os objetos nos espaços dentro do array
