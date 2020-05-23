package loginTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothinCorrect {
@Test
@Parameters({"username","password"})
	public void bothincorrect(String uname,String pwd) {
	System.setProperty("webdriver.chrome.silentOutput", "true");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\SeleniumLearning\\driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	WebElement txtUserName = driver.findElement(By.id("txtUsername"));
	txtUserName.sendKeys(uname);
	WebElement txtpassword = driver.findElement(By.id("txtPassword"));
	txtpassword.sendKeys(pwd);
	WebElement btnlogin = driver.findElement(By.id("btnLogin"));
	btnlogin.click();
	driver.quit();
	

	}
}
