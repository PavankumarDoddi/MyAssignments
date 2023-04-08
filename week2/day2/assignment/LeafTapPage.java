package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapPage {
	
		ChromeDriver driver = new ChromeDriver();
		
	     public void leafTapPageMethod(String a, String b, String c, String d, String e) {
			
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	         
	         driver.get("http://leaftaps.com/opentaps/control/login");
	         WebElement element1 =  driver.findElement(By.id("username"));
	         WebElement element2 = driver.findElement(By.id("password"));
	         WebElement element3 = driver.findElement(By.className("decorativeSubmit"));
	         
	         element1.sendKeys("DemoCsr");
	         element2.sendKeys("crmsfa");
	         element3.click();
	         
	         WebElement element4 = driver.findElement(By.linkText("CRM/SFA"));
	         element4.click();
	         WebElement element5 = driver.findElement(By.linkText("Leads"));
	         element5.click();
	         WebElement element6 = driver.findElement(By.linkText("Create Lead"));
	         element6.click();
	         WebElement element7 = driver.findElement(By.id("createLeadForm_companyName"));
	         WebElement element8 = driver.findElement(By.id("createLeadForm_firstName"));
	         WebElement element9 = driver.findElement(By.id("createLeadForm_lastName"));
	         WebElement element10 = driver.findElement(By.id("createLeadForm_primaryEmail"));
	         WebElement element11 = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
	         element7.sendKeys(a);
	         element8.sendKeys(b);
	         element9.sendKeys(c);
	         element10.sendKeys(d);
	         element11.sendKeys(e);
	         WebElement element12 = driver.findElement(By.name("submitButton"));
	         element12.click();
	 	}

	public static void main(String[] args) {
       
		/*Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on Leads Button
		 
		 * 6. Click on create Lead Button
		 
		 * 7. Enter CompanyName using id Locator
		 
		 * 8. Enter FirstName using id Locator
		 * 9. Enter LastName using id Locator
		 * 10. Enter your mail-id
	   * 11.phone number 
		 * 12. Click on create Lead Button Using name Locator
		 */
	}
}
