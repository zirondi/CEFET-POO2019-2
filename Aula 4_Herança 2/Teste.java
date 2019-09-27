
public class Teste {
	public static void verificar (Animal k[]) {
		int len = k.length;
		for(int i=0; i < len;i++) {
			if(k[i] instanceof Leao) {
				((Leao)k[i]).rugir();	
			}
			k[i].correr();
		}
		
	}

}
