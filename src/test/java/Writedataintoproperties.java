import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedataintoproperties {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("browser", "chrome");
		p.setProperty("username", "prashanth");
		
		FileOutputStream fos = new FileOutputStream("C:\\seleniumfolder\\advanceselenium\\gitpass\\src\\test\\resources\\prashanth.properties");
		p.store(fos,"hoi");
	}

}