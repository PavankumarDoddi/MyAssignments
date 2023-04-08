package week2.day3.assignments;
import java.lang.Thread;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
      
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.get("https://en-gb.facebook.com/");
		 WebElement element1  = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));//applied Partial text based xpath
		 element1.click();
		 Thread.sleep(3000);
		 WebElement element2 = driver.findElement(By.name("firstname"));
		 element2.sendKeys("Pavankumar");
		 WebElement element3 = driver.findElement(By.name("lastname"));
		 element3.sendKeys("Doddi");
		 WebElement element4 = driver.findElement(By.name("reg_email__"));
		 element4.sendKeys("9999999999");
		 WebElement element5 = driver.findElement(By.id("password_step_input"));
		 element5.sendKeys("j@reksi454");
		 
		 Select day = new Select(driver.findElement(By.name("birthday_day")));
		 day.selectByIndex(25);
		 Select month = new Select(driver.findElement(By.name("birthday_month")));
		 month.selectByValue("9");
		 Select year = new Select(driver.findElement(By.name("birthday_year")));
		 year.selectByVisibleText("1992");
		 WebElement element6 = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		 element6.click();
	} 

}
