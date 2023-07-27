package eComProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonTest {
  @Test
  public void amazonDemo() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("Open Amazon",true);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
