package Animais;

public class teste {
	public static void main(String[] args) {
		//Animal a = new Animal(); não compila
		Animal b[] = new Animal [3]; // compila pois esta criando um array de "null" que podem ser objetos concretos
		b[0] = new Gato();
		b[1] = new Papagaio();
		b[2] = new Urso();
		iniciarCorrida(b);
	}
	public static void iniciarCorrida(Animal A[]) {
		for(int i = 0; i < A.length; i++) {
			A[i].correr();
		}
	}

}
