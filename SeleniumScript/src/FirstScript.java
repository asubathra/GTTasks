import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\SeleniumScript\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
	   String title = driver.getTitle();
	   System.out.println("current page Title:" +title);
	
	driver.close();
	}
}
