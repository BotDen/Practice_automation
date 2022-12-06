import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in {

	public static void main(String[] args) {
		String userName = "standard_user";
		String password = "secret_sauce";

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// waiting time for items appeared 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// maximize chrome's windows
		driver.manage().window().maximize();

		// navigate to site
		driver.get("https://www.saucedemo.com/");

		// input credentials
		driver.findElement(By.cssSelector("#user-name")).sendKeys(userName);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);

		// push the login button
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click();

		// check items is displayed 
		driver.findElement(By.xpath("//div[@class='inventory_item']")).isDisplayed();
	}

}
