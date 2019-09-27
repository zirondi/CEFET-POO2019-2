
public class Aluno {
	private String nome;
	private String cpf;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Aluno) {
			Aluno z = (Aluno)o;
			return cpf.equals(z.cpf);
		}
		return false;
	}
	
}
