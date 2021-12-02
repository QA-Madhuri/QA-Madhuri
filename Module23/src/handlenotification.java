import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlenotification {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roops\\OneDrive\\Desktop\\bin\\Selenkum\\chrome\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.tutorialsninja.com/demo/");
	WebElement searchBox = driver.findElement(By.name("search"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid black;');", searchBox);
		
		
		

	}

}
