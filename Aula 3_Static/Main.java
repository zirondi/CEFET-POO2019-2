/** Estado 1
public class Main {
	public static void main(String[] args) {
		Utils u = new Utils();
		System.out.println(u.media(8, 3));
	}
}
**/
public class Main {
	public static void main(String[] args) {
		System.out.println(Utils.media(8, 3));
		System.out.println(Math.sqrt(900));
		System.out.println(Math.random()); //entre 0 e 1 e nunca = 1
		System.out.println(Math.PI);
		
		/**
		Utils2 e = new Utils2();
		Utils2 e2 = new Utils2();
		
		
		e.a = 3;
		System.out.println(e.a);
		e2.a = 5;
		System.out.println(e2.a);
		**/
		Utils2.a = 10;
		System.out.println(Utils2.a);


		//a não é um atributo de instancia e sim da classe
		//No importa o ojeto, a alteração ocorre NA CLASE
		
	}
}

//Um metodo estatico pode ser chamado a partir do nome da classe

//Quando usar o static: Quando não há nenhum atributo na classe
//Quando nao usar o static: funções que alteram o estado dos atributos da classe

//Atributos podem ser estaticos!


//Short bools
// and = &
// x = false, y = true
// x & y -> avalia ambos, retorna falso
// x&&y -> avalia x, ja que é falso, nem gasta recurso
//same with or ( | vs ||)


//Soma com string vira string e concatena






