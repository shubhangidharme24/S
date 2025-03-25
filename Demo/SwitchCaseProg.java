package Demo;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchCaseProg
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println(" Please Select 1 for ChromeBrowser ");
		System.out.println(" Please Select 2 for FirefoxBrowser ");
		System.out.println(" Please Select 3 for EdgeBrowser ");
		System.out.println(" Please Select 4 for defauly ");
		int whichBrowser =  s1.nextInt();
		switch(whichBrowser)
		{
		case 1: System.out.println("Launch chrome browser");
			    ChromeDriver driver =new ChromeDriver();
			    break;
		case 2: System.out.println("Launch firefox browser");
	            FirefoxDriver driver1 =new FirefoxDriver();
	            break; 	
		case 3: System.out.println("Launch edge  browser");
	            EdgeDriver driver2 =new EdgeDriver();
	            break; 
		default: System.out.println("please provide correct case number");
	             break; 
		
		}
		
	}

}
