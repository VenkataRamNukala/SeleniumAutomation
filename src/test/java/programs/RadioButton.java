package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qa-practice.netlify.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("buttons")).click();
		driver.findElement(By.xpath("//*[@id='radio-buttons']"));
		
	}

}
