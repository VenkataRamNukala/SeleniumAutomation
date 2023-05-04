package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Locaters {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		driver.findElement(By.linkText("a-icon a-icon-checkbox")).click();

	}

}
