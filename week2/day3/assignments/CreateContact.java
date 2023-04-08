package week2.day3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
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
        WebElement contactslink = driver.findElement(By.xpath("//a[text()='Contacts']"));
        contactslink.click();
        WebElement createcontact = driver.findElement(By.xpath("//a[text()='Create Contact']"));
        createcontact.click();
        WebElement firstname = driver.findElement(By.xpath("//input[@id='firstNameField'  and @name='firstName']"));
        firstname.sendKeys("Pavankumar");
        WebElement lastname = driver.findElement(By.xpath("//input[@id='lastNameField'  and @name='lastName']"));
        lastname.sendKeys("D");
        WebElement firstlocalname = driver.findElement(By.id("createContactForm_firstNameLocal"));
        firstlocalname.sendKeys("Pavan");
        WebElement lastlocalname = driver.findElement(By.id("createContactForm_lastNameLocal"));
        lastlocalname.sendKeys("kumar");
        WebElement department = driver.findElement(By.id("createContactForm_departmentName"));
        department.sendKeys("ECE");
        WebElement description = driver.findElement(By.id("createContactForm_description"));
        description.sendKeys("welcome to Testleaf. Automation at best");
        WebElement email = driver.findElement(By.id("createContactForm_primaryEmail"));
        email.sendKeys("pavan12345@gmail.com");
        WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select statesel = new Select(state);
        statesel.selectByVisibleText("New York");
        WebElement contactsubmitbutton = driver.findElement(By.className("smallSubmit"));
        contactsubmitbutton.click();
        Thread.sleep(3000);
        WebElement contactEditButton = driver.findElement(By.xpath("//a[text()='Edit']"));
        contactEditButton.click();
        WebElement descriptionclear = driver.findElement(By.id("updateContactForm_description"));
        descriptionclear.clear();
        WebElement importantNotesField = driver.findElement(By.id("updateContactForm_importantNote"));
        importantNotesField.sendKeys("important notes section field. fill the details.");
        WebElement updatecontact = driver.findElement(By.xpath("(//input[@type='submit' and @name='submitButton'])[1]"));
        updatecontact.click();
        
        System.out.print(driver.getCurrentUrl());
	}

}
