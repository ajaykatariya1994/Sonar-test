package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
      public static Properties prop;
      public static WebDriver driver;
      
      public TestBase() {
    	  prop = new Properties();
    	  String path = System.getProperty("user.dir")+"//src//test//resources//config.properties";
    			try {
    				FileInputStream fin = new FileInputStream(path);
    				prop.load(fin);
    			} catch(FileNotFoundException e) {
    				e.printStackTrace();
    			}catch(IOException e) {
    				e.printStackTrace();
    			}
    	  
      }
      public static void initialize() {
    	  String browser = prop.getProperty("browser");
    	  
    	  if(browser.equalsIgnoreCase("chrome")) {
    		  System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");
    		  driver = new ChromeDriver();
    	  }
    	  else if(browser.equalsIgnoreCase("firefox")) {
    		  
    	  }
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	  driver.get(prop.getProperty("url"));
      }
}