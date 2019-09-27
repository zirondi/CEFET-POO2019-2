
public class Main {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Leandro", 21);
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		
	}
}

//Toda vez que o new Pessoa(); é chamado o construtor é rodado;
//O construtor é da classe
//Pessoa [] p2 = new Pessoa [3] NAO CHAMA O CONSTRUTOR E NAO CRIA OS OBJETOS INTERNOS, LEMBRAR DISSO NA PROVA
//Atributos (atributos de instancia) do objeto são chamados de estado do objeto
