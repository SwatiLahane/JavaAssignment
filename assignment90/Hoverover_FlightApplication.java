package assignment90;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//On  https://grotechminds.com/automate-me/, hoverover flight application and click on Read more


public class Hoverover_FlightApplication {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		//xpath using text msg
		WebElement e2 = driver.findElement(By.xpath("//span[. = 'Sign in']"));
        e2.click();  
        

	}

}
