package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LeafTapPageLeadUpdate {

	public static void main(String[] args) {
     
		LeafTapPage obj = new LeafTapPage();
		obj.leafTapPageMethod("Astra6", "Pavan", "Kumar", "pavan1234@gmail.com", "9999999999");
        WebElement element14 = obj.driver.findElement(By.linkText("Edit"));
        element14.click();
        WebElement element15 = obj.driver.findElement(By.id("updateLeadForm_companyName"));
		element15.clear();
		element15.sendKeys("Astra8");
		WebElement element16 = obj.driver.findElement(By.xpath("(//input[@name='submitButton'])[1]"));
		element16.click();
		obj.driver.close();
	}

}
