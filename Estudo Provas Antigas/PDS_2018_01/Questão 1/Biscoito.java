
public class Biscoito {
	private String id;
	private String cor;
	private int preco;
	
	public Biscoito(String id) {
		this.id = id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public String getId() {
		return id;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getPreco() {
		return preco;
	}
	
	@Override
    public boolean equals(Object o){
    	if (o instanceof Biscoito) {
    		return this.id.equals(((Biscoito)o).getId());
    	} else {
    		return false;
    	}
    }
	
}