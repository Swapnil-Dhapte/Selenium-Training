package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;


public class LoadAmazon {
	@Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdhapte\\Downloads\\chromedriver_win32_final\\chromedriver.exe");
			 ChromeDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     
		     driver.get("https://amazon.in");
		     Object j;
		  //   driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		     
		     driver.findElement(By.linkText("Best Sellers")).click();
		       
		    //
		      //  System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Deals')]")) instanceof Object);	
		        
		     //driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Books')]")).click();
		     //Assert.assertEquals(false, false);
		     
		}
}