import java.util.Random;

public class Gato {
	String nome;
	int idade;
	double peso;
	void miar() {
		System.out.println("Gato " + nome + " miando!");
	}
	
	void brigar(String inimigo) {
		Random gerador = new Random();
		if (gerador.nextInt() % 2 == 0) {
			System.out.println(inimigo + " brigou com " + nome);
			System.out.println(inimigo + " ganhou a briga!");
		} else {
			System.out.println(inimigo + " brigou com " + nome);
			System.out.println(nome + " ganhou a briga!");
		}
			
	}
}

/*
 *Os 8 primitivos
int = 32 bit
float 
double
char
boolean
long  = 64 bit 
byte = 8 bit (-128 -> 127)
short = 16 bit
*/

/*
Classes começam com letra maíscula inicial
 *no momento*
Java - tudo é classe/objeto menos os tipos primitivos
Variaveis de referencia = coisas com Maiusculo primeiro
(referem a objetos)
Gato g = new Gato;
G -> o objeto gato

Java -> definir tipos explicitamente
Gato u = new Cachorro; (nao funciona)

long é int glorificado que nao eh alocado a nao ser que vc avise
float é um double glorificado que nao eh alocado a nao ser que vc avise 


*/