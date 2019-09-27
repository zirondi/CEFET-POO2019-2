
public class Programa {
	public static void main(String[] args) {
		//Criando um novo objeto gato na variavel x
		Gato x = new Gato();
		x.nome = "Felix";
		x.idade = 9;
		x.peso = 5.5;

		//System.out.println(g);

		//System.out.println(x.nome + " " + x.idade + " " + x.peso);
		//x.miar();		
		
		Gato y = new Gato();
		y.nome = "Garfield";
		y.idade = 5;
		y.peso = 7.5;
		
		//System.out.println(y.nome + " " + y.idade + " " + y.peso);
		//y.miar();
		
		//System.out.println();
		//x.brigar(y.nome);
		
		//System.out.println();
		//y.brigar(x.nome);
		
		//Comentarios de Aula:
		
		//Não funciona
		//long g = 18097499952;
		//Funciona
		//long g = 18097499952L;
		
		//Mesmo funcinando por terem o msm tamanho, java nao aceita
		//long b = 2;
		//byte x = b;
		
		//É preciso fazer o casting;
		//long b2 = 2;
		//byte x2 = (byte) b2;
		//System.out.println(x2);
		
		//Porém cuidado
		//long c = 256; //1000000
		//byte z = (byte) c; // 1 | 000000
		//System.out.println(z);
		
		//Somas/Multiplicação resultam em int!
		//byte n = 3;
		//byte p = 4;
		//Errado byte q = n + p; 
		//Correto byte q = (byte)(n+p)
		
		//Bools são true ou false
		
		/**Estruturas basicas
		 * (Nao eh igual ao C++, A precisa ser BOOL)
		 * if(A == true){
		 * syso("oka")
		 * }else if(condição){
		 * 	bla bla 
		 * } else{
		 * 	bla bla
		 * }
		 * 
		 * for(int i = 0 ; i < n ; i++){
		 * 	stuff
		 * }
		 * 
		 * int i = 10;
		 * 
		 * while(i > 0){
		 * 	stuff
		 * 	i--;
		 *}
		 *
		 *int i = 10;
		 *do{
		 *	stuff
		 *	i--;
		 *)while(i > 0)
		 *
		 *break & continue
		 *
		 *(pula o 3)
		 *
		 *for(int i = 0; i < n; i++){
		 * if(i == 3)continue;
		 * syso(i);
		 * 
		 * acaba no 3
		 * idem porem break
		 * 
		 * 
		 * 	copia e incrementa
			int k = 5;
			int l = k++;
			System.out.println(k);
			System.out.println(l);
		
			incrementa e copia
			int i = 5;
			int j = ++i;
			System.out.println(i);
			System.out.println(j);

		 * 
		 * bloco de declaração
		 * {} seguram variaveis
		 * 
		 */
		

	}
}
