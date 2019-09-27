
public class Caixa {
	public static void main(String[] args) {
		Conta corrente = new Conta();
		
		corrente.setCorrentista("Ana");
		corrente.setSaldo(10);
		
		double valorMovimento = 100;
		/**
		corrente.sacar(valorSaque);
		System.out.println(corrente.saldo);
		
		//Porém nada impede de fazer:
		
		corrente.saldo = corrente.saldo - valorSaque;
		System.out.println(corrente.saldo);
		
		//Atributos chamado private só podem ser acessados dentro da própria classe
		**/
		
		//Maneira correta
		System.out.println("Olá " + corrente.getCorrentista() + "!" );
		corrente.movimentar(valorMovimento);
		System.out.println("O saldo atual é de " + corrente.getSaldo() + " reais");
		
	}
}
