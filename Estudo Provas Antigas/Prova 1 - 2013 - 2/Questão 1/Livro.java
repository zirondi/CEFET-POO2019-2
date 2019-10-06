public class Livro implements Comparable<Livro> {
	private String Nome;
	private int Quantidade;
	
	
	//Gets and Setter
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public int getQuantidade() {
		return Quantidade;
	}
	
	public void setQuantidade(int Quantidade) {
		this.Quantidade = Quantidade;
	}
	
	@Override
	public int compareTo(Livro o) {
		return this.Quantidade - ((Livro)o).getQuantidade();
	}
}


