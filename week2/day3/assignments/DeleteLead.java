package week2.day3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("http://leaftaps.com/opentaps/control/login");
        WebElement username =  driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
        
        username.sendKeys("DemoCsr");
        password.sendKeys("crmsfa");
        loginbutton.click();
        
        WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
        CRMSFA.click();
        WebElement leadsLink = driver.findElement(By.linkText("Leads"));
        leadsLink.click();
        Thread.sleep(3000);
        WebElement findLead = driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")); //used Grand parent & grand child relation
        findLead.click();
        Thread.sleep(3000);
        WebElement phoneclick = driver.findElement(By.xpath("(//a[@class='x-tab-right']//span[@class='x-tab-strip-text '])[2]")); //used Grand parent & grand child relation followed by collection based approach.
        phoneclick.click();
        WebElement phonenumber = driver.findElement(By.xpath("//div[@class='x-plain-bwrap']//input[@name='phoneNumber']"));
        phonenumber.sendKeys("9999999999");
        WebElement searchClick = driver.findElement(By.xpath("//button[text()='Find Leads']"));
        searchClick.click();
        Thread.sleep(3000);
        WebElement selectFirst = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[contains(@class,'x-grid3-cell-first')]//a"));
        String text = selectFirst.getText();
        System.out.println(text);
        selectFirst.click();
        WebElement deleteLead = driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous' and text()='Delete']"));
        deleteLead.click();
        driver.navigate().to("http://leaftaps.com/crmsfa/control/leadsMain");
        Thread.sleep(3000);
        WebElement findLeadNew = driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")); //used Grand parent & grand child relation
        findLeadNew.click();
        Thread.sleep(5000);
        WebElement searchLead = driver.findElement(By.xpath("//label[contains(text(),'Lead ID:')]/following::input[@name='id']")); //used elder cousin to younger cousin relationship.
        searchLead.sendKeys(text);
        WebElement findLeadClick = driver.findElement(By.xpath("//td[@class='x-btn-center']//button[contains(text(),'Find Leads')]")); // used Grand Parent to Grand Child
        findLeadClick.click();
        Thread.sleep(5000);
        WebElement recordSearchRes = driver.findElement(By.className("x-paging-info"));
        String text2 = recordSearchRes.getText();
        System.out.println(text2);
        if (text2.equals("No records to display"))
        {
        	System.out.print("Successfully verfied that the created lead is deleted from the system."+'\n'+text2);
        }
        Thread.sleep(5000);
        driver.close();
	}

}
