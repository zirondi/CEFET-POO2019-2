
public class Tools {
	public static String subst (String x) {
		String f = "";
		char c[] = x.toCharArray();
		
		for (int i=0; i < c.length; i++) {
			if(c[i] =='a') {
				f += "4";
			}else {
				f += c[i];
			}
		}
		
		return f;
	}
}
