package assignment71;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args)
	{
         
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.firstcry.com");
		
		WebElement partiallink = driver.findElement(By.partialLinkText(" GIRL"));
		
		partiallink.click();
	}

}
