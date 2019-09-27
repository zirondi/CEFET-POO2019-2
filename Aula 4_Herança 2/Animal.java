
public class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	
	
	
	//Gets and Setters
	//this.foo => variavel do Objeto
	//this(foo) <- qual construtor nesse programa que usa só o tipo de foo, usa esse construtor e segue pro proximo
	//implicito nos construtores -> super()
	//Isso é uma chama a classe superiora, para alocar todos os objetos com hierarquia maior que a classe
	//No nosso caso é apenas a Object
	// this() acessando algum construtor
	//Toda primeira linha de um construtor deve ser ou this ou super()
	//Se vc chama o this o super() é implicitamente colocado ali
	//Ficar de olho nos construtores, se vc muda o construtor do topo da hierarquia, isso desce com o super!
	//Exception do constructor em loop recursive constructor invocation
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void correr() {
		System.out.println("Animal " + nome + " correndo!");
	}
}
