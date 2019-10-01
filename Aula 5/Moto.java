
public class Moto extends Veiculo implements Corredor{
	public void correr() {
		System.out.println("Moto correndo");
		System.out.println("A velocidade é :"+Corredor.VELOCIADADE_MAX);
	}
}
