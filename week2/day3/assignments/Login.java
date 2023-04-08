package week2.day3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver = new ChromeDriver();
	public void loginmethod() {
		 driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://leaftaps.com/opentaps/control/login");
       WebElement username =  driver.findElement(By.id("username"));
       WebElement password = driver.findElement(By.id("password"));
       WebElement login = driver.findElement(By.className("decorativeSubmit"));
       username.sendKeys("DemoCsr");
       password.sendKeys("crmsfa");
       login.click();
       WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
       CRMSFA.click();
	}
}
