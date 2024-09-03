package assignment88;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Amazon {

	public static void main(String[] args)
	{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
	}

}
