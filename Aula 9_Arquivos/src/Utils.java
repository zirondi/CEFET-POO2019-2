import java.io.*;

public class Utils {
	public static void persistir(Object o, String path) throws IOException {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(o);
			oos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
