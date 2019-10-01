
public class Principal {
	public static void main (String [] args) {
		Veiculo [] v = new Veiculo[5];
		v[0] = new Carro();
		v[1] = new Aviao();
		v[2] = new Moto();
		v[3] = new Helicoptero();
		v[4] = new Hidroaviao();
		iniciar(v);
	}
	public static void iniciar(Veiculo [] v) {
		for(int i = 0; i<v.length; i++) {
			if(v[i] instanceof Corredor) {// se não tivesse a interface eu teria que fazer o casting de cada veiculo que corre
				((Corredor)v[i]).correr();
			}
			if(v[i] instanceof Voador) {
				((Voador)v[i]).voar();
			}
		}
	}
}
// pode existir uma interface Constants com as constantes, que esta classe implementaria
