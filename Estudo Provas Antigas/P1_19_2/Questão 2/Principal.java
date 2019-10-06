import java.util.*;

public class Principal {
	public static void main(String[] args) {
		double imc = 0;
		double imctot = 0;
		int maiores = 0;
		boolean achei = false;
		
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		nome = nome.toLowerCase();
		scanner.close();
		List<String> lista = BancoDeDados.getLista();
		
		for(int i = 0; i < lista.size(); i++) {
			String check = lista.get(i);
			String[] checkArr = check.split("#");
			if(achei) {
				double peso = Double.parseDouble(checkArr[1]); //Acho que a estrutura era nome#peso#altura, nao tenho certeza
				double altura = Double.parseDouble(checkArr[2]);
				double imctemp = peso/(altura*altura);
				
				if(imctemp > imc) {
					maiores++;
				}
				
				imctot = imctot + imctemp;
			}
			
			if(checkArr[0].toLowerCase().equals(nome) && (achei == false)) {
				achei = true;
				i = 0; //Reiniciando o loop
				
				nome = checkArr[0];
				
				double peso = Double.parseDouble(checkArr[1]); //Acho que a estrutura era nome#peso#altura, nao tenho certeza
				double altura = Double.parseDouble(checkArr[2]);
				imc = peso / (altura*altura);
			}
		}// Fim for
		
		maiores = 1 / maiores;
		imctot = imctot / lista.size();
		
		System.out.print(nome + " - " + imc + " - " + imctot + " - " + maiores);
		
		if(imc > 40) {
			System.out.print(" - ALERTA");
		}
		
		System.out.println();
		
	}
}







//LIsta vem de BancoDeDados.getLista()
//Vc quer ler o nome, achar ele na lista, e printar Nome - IMC - IMC medio - Indice de Maiores - (se IMC>40) ALERTA
