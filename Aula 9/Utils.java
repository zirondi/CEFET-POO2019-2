import java.io.*;

public class Utils {
	public static void persistir(Object o, String path){
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object ler(String path){
		try {
			FileInputStream fis = new FileInputStream(new File(path));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			ois.close();
			fis.close();
			return o;
			
		} catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
