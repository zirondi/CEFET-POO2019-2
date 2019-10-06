
public abstract class Figura {
	private String cor;
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getcor() {
		return cor;
	}
	
	public Figura(String cor) {
		this.cor = cor;
	}
	
	public abstract void desenhar();
	
	
}
