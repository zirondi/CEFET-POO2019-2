
public class Principal {
	public static void main(String[] args) {
		//Verificar se Gabigol esta na frase
		String str = "Hoje tem gol do Gabigol";
		System.out.println(verificar(str, "Gabigol"));
		System.out.println(verificar2(str, "Gabigol"));
		
		//Verificar se a string k começa com http
		String k = "http://facebook.com.br";
		System.out.println(k.startsWith("http"));
		
		//k.endsWith("jpg")
		//Replace retorna a string nova
		//str = str.replace("Gabigol", "B. Henrique");
		
		System.out.println(str.replace(" ", ""));
		
		String str2 = "A casa amarela";
		System.out.println(str2.substring(2,4));
		
		masoquismo(str);
	}
	
	public static boolean verificar(String frase, String x) {
		return frase.toLowerCase().contains(x.toLowerCase());
	}
	
	public static boolean verificar2(String frase, String x) {
		if(frase.toLowerCase().indexOf(x.toLowerCase()) > -1) {
			return true;
		}
		return false;
	}
	
	public static void masoquismo(String str) {
		String palavra = "gol";
		
		int indice = str.indexOf(palavra);
		
		String str2 = str.substring(0, indice);
		
		str2 += "xxx";
		str2 += str.substring(indice + palavra.length(), str.length());
		
		System.out.println(str2);
	}
}





