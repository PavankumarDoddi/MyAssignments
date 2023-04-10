package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		Login obj = new Login();
		obj.loginmethod();
		WebElement leadsLink = obj.driver.findElement(By.linkText("Leads"));
        leadsLink.click();
        Thread.sleep(3000);
        WebElement findLead = obj.driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")); //used Grand parent & grand child relation
        findLead.click();
        Thread.sleep(3000);
        WebElement firstName = obj.driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]"));
        firstName.sendKeys("Pavankumar");
        Thread.sleep(3000);
        WebElement searchClick = obj.driver.findElement(By.xpath("//button[text()='Find Leads']"));
        searchClick.click();
        Thread.sleep(3000);
        WebElement selectFirst = obj.driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//td[contains(@class,'x-grid3-cell-first')]//a"));
        String text = selectFirst.getText();
        System.out.println(text);
        selectFirst.click();
        Thread.sleep(5000);
        WebElement leadTitle = obj.driver.findElement(By.id("sectionHeaderTitle_leads"));
        String text2 = leadTitle.getText();
        System.out.println(text2);
        
        
        if (text2.equals("View Lead"))
        {
        	
        	System.out.println("Entered into If condition after validation of title page"+" "+text2);
        	
        	WebElement editLink = obj.driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']"));
        	editLink.click();
        	Thread.sleep(3000);
        	WebElement companyName = obj.driver.findElement(By.id("updateLeadForm_companyName"));
        	companyName.clear();
        	companyName.sendKeys("Astra10");
        	WebElement updateClick = obj.driver.findElement(By.xpath("//span[text()='Important Note']/ancestor::tr[1]/following-sibling::tr//input")); 
        	updateClick.click();
        }
        
        Thread.sleep(5000);
        obj.driver.close();
        
        

	}

}
