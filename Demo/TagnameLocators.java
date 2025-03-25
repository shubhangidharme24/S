package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("shubhangi.dharme9@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shubhangi@24");
		WebElement p = driver.findElement(By.tagName("button"));//using tagname here
		p.click();
		
		driver.manage().window().maximize();

	}

}
