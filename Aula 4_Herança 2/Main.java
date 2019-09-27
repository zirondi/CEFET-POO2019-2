
public class Main {
	public static void main(String[] args) {
		//Urso u = new Urso();
		//u.setNome("Pooh");
		//System.out.println(u.getNome());
		
		//Todos objetos são heranças de Object que tem metodos proprios que são herdados, como o:
		//System.out.println(u);
		//Que é a mesma coisa que:
		//System.out.println(u.toString());
		
		//u.correr();
		
		//O metodo correr da classe leão: Vc ta sobrescrevendo em cima do correr do Animal
		//O comportamento que vai estar valendo é o da classe mais proxima
		
		//Leao x = new Leao();
		//x.setNome("Simba");
		//x.correr();
		//x.rugir();
		
		/*
		 * *Animal* x = new *Leao()*;
		 * x.setNome("Simba");
		 * x.correr();
		 * 
		 * var do tipo animal, objeto leao
		 * como leao é uma subclasse de animal, isso é possivel
		 * 
		 * Leao x = new Animal();
		 * 
		 * Impossível pq nem todo animal é leão!
		 * 
		 * Agora, relacionado ao metodo rugir q é próprio da classe Leao
		 * 
		 * Se eu defino meu objeto leao de tipo animal, ele nunca enxerga o metodo rugir.
		 * 
		 * Da perspectiva da variavel ele enxerga apenas o que esta "em cima" dele
		 * E o sobrescrito funciona pq é definido em animal 
		 * 
		 * Erro de compilação.
		 * 
		 * Tempo de compilação -> rugir nao compila, pq rugir nao existe numa var tipo animal
		 * 
		 * >"eh possivel chamar o correr numa var do tipo animal?"
		 * >Okay compilou
		 * 
		 * Tempo de execução ->
		 * 
		 * >do tipo pra cima "Leao tem o metodo correr nele?"
		 * >tem!
		 * >Chama!
		 * 
		 * Com o urso:
		 * >"urso tem o metodo correr?"
		 * >nao
		 * >sobe uma hierarquia
		 * >line 1
		 * 
		 * (como esta compilado é garantido que isso esteja em algum lugar da hierarquia)
		 * 
		 */
		
		//Não há herança de métodos privados
		
		
		/*
		 * public static void test (Animal y){
		 * syso(y.getNome());
		 * syso(y.getIdade());
		 * y.correr();
		 * y.rugir();
		 * }
		 * 
		 * main{
		 * Leao x = new Leao();
		 * x.setNome("Simba");
		 * x.setIdade(10)
		 * teste(x);
		 * }
		 *
		 *
		 * 8 Perguntas
		 * 
		 * 1 - Compila?
		 * 	Não, erro em y.rugir().
		 * 	O compiler vai ler a classe e ver que ela é Animal e tem o metodo rugir
		 * 	"Removendo" y.rugir
		 * 	Da perspectiva de y, simba é um animal.
		 * 	
		 * 2 - 
		 */
		
		/*
		 * Fazer o leão rugir antes de correr
		 * public static void test (Animal y){
		 * if(y instanceof Leao){
		 * 		Leao x = (Leao) y;
		 * 		x.rugir();
		 * 
		 * 		OU
		 * 		
		 * 		((Leao)y).rugir();
		 * 
		 * }
		 * 
		 * main{
		 * Leao x = new Leao();
		 * x.setNome("Simba");
		 * x.setIdade(10)
		 * teste(x);
		 * }
		 */
		
		
		/*
		 * Tipos primitivos são copiados para dentro de funções
		 * Tipos nao primitivos são referenciados para dentro de funções
		 * 
		 */
		
		
		Animal k[] = new Animal[3];
		
		k[0] = new Urso();
		k[0].setNome("Pooh");
		
		
		k[1] = new Leao();
		k[1].setNome("Simba");
		
		k[2] = new Tartaruga();
		k[2].setNome("Esguicho");
		
		Teste.verificar(k);
		
		
		/*
		 * Sobrecarga de metodo -> msm nome, tipo e/ou numero de paramentros diff no msm metodo
		 * Sobrescrita de metodo -> Sobrescrito do metodo em uma subclasse
		 * Construtor não é herdado!
		 * 
		 */
		
		//System.out.println(Calculadora.getSoma(3, 5));
		//System.out.println()
		
		
		
		
		
	}

}
