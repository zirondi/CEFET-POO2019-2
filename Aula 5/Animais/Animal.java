package Animais;

public abstract class Animal {
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public abstract void correr(); // subclasses não irão compilar se nao implementarem o metodo abstrato (public void correr())
		

}
