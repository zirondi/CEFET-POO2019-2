public class Pessoa{
	private String nome;
	private int idade;
	
	//Explicitar os contrutores REMOVE O PADRÃO PESSOA()
	public Pessoa(String n, int i) {
		nome = n;
		idade = i;
		System.out.println("Entrou no construtor");
	}
	
	public Pessoa(int i) {
		idade = i;
		System.out.println("Entrou no construtor");
	}
	
	public Pessoa(String n) {
		nome = n;
		System.out.println("Entrou no construtor");
	}
	
	public Pessoa() {
		
	}	
	
	public void setNome (String setNome) {
		nome = setNome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int setIdade) {
		idade = setIdade;
	}
	
	public int getIdade() {
		return idade;
	}
}	

//Contrutores
/**
* Ao criar um novo objeto new Pessoa();
* o () é o construtor do objeto
* omitido(implicito), na classe existe um codigo
* public Pessoa (){
* }
* 
* 
* 
* 
* 
**/