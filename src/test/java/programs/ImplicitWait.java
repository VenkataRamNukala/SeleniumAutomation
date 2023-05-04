package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//*[@class=\'LC20lb MBeuO DKV0Md\']")).click();
		driver.close();

	}

}
