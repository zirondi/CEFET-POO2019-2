import java.util.*;
public class Media {
	public static double getMedia(ArrayList x) {
		double m = 0;
		
		for (int i=0; i<x.size(); i++) {
			m += Integer.parseInt(((String)x.get(i)).split("#")[1]);
		}		
		return (m/x.size());
	}
	
	public static double MediaGustavo(List x){
		double soma = 0;
		int cont = 0;
		
		for(int i = 0; i < x.size();i++) {
			if(x.get(i) instanceof String) {
				cont++;
				String str = (String)x.get(i);
				String vet [] = str.split("#");
				int idade = Integer.parseInt(vet[1]);
				//Double.parseDouble
				soma += idade;
			}
		}
		
		return soma/cont;
	}
}