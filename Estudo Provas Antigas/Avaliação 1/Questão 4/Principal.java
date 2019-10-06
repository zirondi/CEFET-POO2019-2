//Questão 4
public class Principal {
	public static Figura retornaFiguraAleatoria() {
		int i = (int)(Math.random()*100);
		if(i % 2 == 0) {
			return new Quadrado("azul");
		} else {
			return new Pentagono("vermelho");
		}
	}
	
	public static void contarFiguras(Figura[] array) {
		int quantQuadrado = 0, quantPentagono = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] instanceof Quadrado) {
				quantQuadrado++;
			} else if(array[i] instanceof Pentagono) {
				quantPentagono++;
			}
		}
		
		System.out.println("No array há " + quantQuadrado + " quadrados e " + quantPentagono + " pentágonos.");
			
	}
	
	public static void recortarSePossivel(Figura[] array) {
		for(int i = 0; i < array.length; i++)
			if (array[i] instanceof Pentagono) {
				((Pentagono)array[i]).recortar();
			}
	}
	
	public static void main(String args[]) {
		Figura[] array = new Figura[1000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = retornaFiguraAleatoria();
		}
		
		contarFiguras(array);
		recortarSePossivel(array);
		System.out.println("Fim do programa...");
		
		
		
	}
	
}
