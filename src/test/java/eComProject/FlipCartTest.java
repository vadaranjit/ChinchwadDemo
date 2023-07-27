package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipCartTest {
  @Test
  public void flipCartDemo() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Open FlipCart",true);
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
