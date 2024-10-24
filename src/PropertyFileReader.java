import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileReader
{
	static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		String filePath = System.getProperty("user.dir");

		FileInputStream fin = new FileInputStream(filePath+"\\ObjectRepo\\Config.properties");

		Properties pro = new Properties();
		pro.load(fin);
		String browserName = pro.getProperty("browser");
		System.out.println("browserName  : "+browserName);

		String url = pro.getProperty("url");
		System.out.println("url  : "+url);

		String who = pro.getProperty("who");
		System.out.println("who  : "+who);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", filePath+"\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) 
		{
			driver = new EdgeDriver();	
		}
		else if (browserName.equals("Firefox")) 
		{
			driver = new FirefoxDriver();	
		}

		driver.get("https://rbgtechnologies.com/");
		
		driver.quit();

	}

}
