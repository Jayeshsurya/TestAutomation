package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://jksuryawanshi.azurewebsites.net/webapp/");
		String text =driver.findElement(By.xpath("/html/body/h1[2]")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("This is the first change done"));
		driver.close();
	}
}
