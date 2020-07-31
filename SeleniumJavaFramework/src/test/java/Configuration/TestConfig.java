package Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestConfig {

	@Test
	public void TestConf() throws Exception
	{
		File src =new File("./Config/config.property");
		try {
			FileInputStream fis= new FileInputStream(src);
			Properties prop=new Properties();
			prop.load(fis);
			String ChromeDriverPath=prop.getProperty("ChromeDriver");
			System.out.println("ChromeDriverpath:"+ChromeDriverPath);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
