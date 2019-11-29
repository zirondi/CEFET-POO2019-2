
public class Pessoa implements Comparable<Pessoa>{
	
	//A
	private String cpf;
	private String nome;
	private Integer idade;
	
	//A
	public Pessoa(String cpf) {
		this.cpf = cpf;
	}
		
	public String getCpf() {
		return this.cpf;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	//A
	public boolean equals(Object o) {
		if (o instanceof Pessoa) {
			return this.cpf.equals(((Pessoa)o).getCpf()) && this.idade.equals(((Pessoa)o).getIdade());
		} else {
			return false;
		} 
	}
	//B
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.getNome());
	}
	//C	
	//public String toString() {
		//return this.cpf + ' ' + this.nome + ' ' +  this.idade.intValue();
	//}
	
}
