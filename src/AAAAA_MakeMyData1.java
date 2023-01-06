

import java.io.File;
import java.io.FileOutputStream;

public class AAAAA_MakeMyData1 {

	public static void main(String[] args) {
//		String msg = "win : 5\ndraw : 5\nrate : 5";
		String msg[] = {"win : 5", "draw : 5", "rate : 5"};
		
		String fileName = "Stat.txt";
		File file = null;
		FileOutputStream fos = null;
		
		try {
			file = new File(fileName);
			fos = new FileOutputStream(file);
			
			int stat = msg.length;
			fos.write(stat);
			

			
			fos.close();
		}catch (Exception e) {
			
		}

	}

}
