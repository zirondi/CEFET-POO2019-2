
public class Aviao extends Veiculo implements Voador{
	public void voar() {
		System.out.println("Avião voando");
		System.out.println("A velocidade é :"+Voador.VELOCIDADE_MAX);
	}
}
