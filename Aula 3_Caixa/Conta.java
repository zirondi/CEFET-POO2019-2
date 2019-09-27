
public class Conta {
	
	//Definir como private impede acesso a essas vars/metodos fora da classe.
	//Encapsular os atributos.
	private String nome;
	private double saldo;
	public void movimentar(double saque) {
		if(saque <= saldo) {
			saldo = saldo - saque;
			System.out.println("Saque feito com sucesso!");
		}else {
			System.out.println("Saque maior que saldo na conta.");
		}
	}
	
	//Funções get/set são chamadas de interface da classe
	//são os metodos que interagem com as variaveis/outros metodos da classe
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double deposito) {
		saldo = deposito;
	}
	public void setCorrentista(String setNome) {
		nome = setNome;
	}
	public String getCorrentista() {
		return nome;
	}
	//Esses metodos ajudam na modularização(manutenção?), se a regra de negocio do meu saque mude
	//Por exemplo, preciso cobrar algum imposto agora
	//Apenas preciso editar a classe sacar (ou num mome melhor, movimentar)
	//E todos os outros metodos que utilizam o metodo movimentar serão atualizados automaticamente
	//Uma classe com gets e sets para todas suas vars é chamada de java bean + um construtor sem parametros
}


//Usar set/get para atribuir/retirar

//Coisas vistas em provas:
//Criar a classe pessoa com 2 atributos, por exemplo
//E crie os gets e sets
/**
public class Pessoa{
	private String nome;
	private int idade;
	
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
**/


