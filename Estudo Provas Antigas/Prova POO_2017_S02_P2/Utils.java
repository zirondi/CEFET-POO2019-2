import java.util.*;


public class Utils {
	//A
	public static boolean existe(List<Pessoa> x, Pessoa y) {
		return x.contains(y);
	}
	
	//C
	public static void ordena(List<Pessoa> x) {
		Collections.sort(x);
	}
	
	//E
	//: CPF#nome#idade#tipo
	public static Map<String, Pessoa> retornaDados(Set<String> conjuntoPessoas) throws FormatoIncorretoException{
		Map<String, Pessoa> m = new HashMap<String, Pessoa>();
		Iterator<String> it = conjuntoPessoas.iterator();
		
		try {
			while(it.hasNext()) {
				String temp = it.next();
				String[] strArr = temp.split("#");
				
				if (strArr.length > 4 || strArr.length < 4) {
					throw new FormatoIncorretoException("O formato da String " + temp + " esta incorreto.");
				} else {
					if(strArr[3].toLowerCase().equals("j")) {
						m.put(strArr[0], new PessoaJuridica(strArr[0]));
					} else if(strArr[3].toLowerCase().equals("f")){
						m.put(strArr[0], new PessoaFisica(strArr[0]));
					}			
				}	
			}
				
		} catch (FormatoIncorretoException e) {
			System.out.println(e.getMessage());
		}
		return m;
	}
}
