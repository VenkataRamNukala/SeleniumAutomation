package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Explicitwait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\'LC20lb MBeuO DKV0Md\']")));
		element.click();
		driver.close();
		
		
	}

}
