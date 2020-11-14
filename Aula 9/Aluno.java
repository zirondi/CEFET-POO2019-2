import java.io.Serializable;

public class Aluno implements Comparable<Aluno>, Serializable{
	String nome;
	Double nota;
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	//Constructor
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	@Override
	public int compareTo(Aluno a) {
		if (this.nota > a.getNota()) {
			return 1;
		} else if (this.nota < a.getNota()) {
			return -1;
		} else {
			return this.nome.compareTo(a.getNome());
		}
	}
	/**
	public boolean equals(Object o) {
		return this.nome.equals((String)o);
		
	}
	**/
}
