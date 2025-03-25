package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProgFindelement {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("shubhangi.dharme9@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shubhangi@24");
		driver.findElement(By.name("login")).click();
		
		driver.get("https://www.amazon.in/s?k=login+amazon+account&adgrpid=59671903835&ext_vrnc=hi&hvadid=590652406969&hvdev=c&hvlocphy=9062097&hvnetw=g&hvqmt=e&hvrand=17056493331682090951&hvtargid=kwd-837441119212&hydadcr=24542_2265395&mcid=21027f31522b357794b2e3ec13f3c9f7&tag=googinhydr1-21&ref=pd_sl_2cwzc6x246_e");
		
		
		
		
		

	}

}
