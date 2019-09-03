import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		File f = new File(path+"\\read.txt");
		try {
			FileReader fr = new FileReader(f);
		    int ch;
			while((ch =fr.read())!=-1) {
				System.out.print((char)ch);
				
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
