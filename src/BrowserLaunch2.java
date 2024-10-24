import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rbgtechnologies.com/");
		
	}

}
