package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
	    
		Login obj = new Login();
		obj.loginmethod();
		WebElement leadsLink = obj.driver.findElement(By.linkText("Leads"));
        leadsLink.click();
        Thread.sleep(3000);
        WebElement findLead = obj.driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")); //used Grand parent & grand child relation
        findLead.click();
        Thread.sleep(3000);
        WebElement emailClick = obj.driver.findElement(By.xpath("(//a[@class='x-tab-right']//span[@class='x-tab-strip-text '])[3]")); //used Grand parent & grand child relation followed by collection based approach.
        emailClick.click();
        Thread.sleep(3000);
        WebElement emailValue = obj.driver.findElement(By.xpath("//label[text()='Email Address:']/following::input[@name='emailAddress']")); //used Grand parent & grand child relation followed by collection based approach.
        emailValue.sendKeys("pavan1234@gmail.com");
        WebElement searchClick = obj.driver.findElement(By.xpath("//button[text()='Find Leads']"));
        searchClick.click();
        Thread.sleep(3000);
        WebElement selectFirst = obj.driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[contains(@class,'x-grid3-cell-first')]//a"));
        String text = selectFirst.getText();
        System.out.println(text);
        selectFirst.click();
        Thread.sleep(5000);
        WebElement duplicateLead = obj.driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']"));
        duplicateLead.click();
        Thread.sleep(5000);
        WebElement pageTitle = obj.driver.findElement(By.id("sectionHeaderTitle_leads"));
        String text3 = pageTitle.getText();
        System.out.println(text3);
        if(text3.equals("Duplicate Lead"))
        {
        	Thread.sleep(3000);
        	WebElement createDupLead = obj.driver.findElement(By.xpath("//input[@value='Create Lead']"));
        	createDupLead.click();
        }
       
        Thread.sleep(5000);
        obj.driver.close();
        
        
	}

}
