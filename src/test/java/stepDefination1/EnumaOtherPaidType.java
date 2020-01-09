package stepDefination1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class EnumaOtherPaidType extends Base {
	WebDriver driver ;

@And("^clicks on other Paid type course in the Courses dropdown$")
public void clicks_on_other_Paid_type_course_in_the_Courses_dropdown() throws Throwable {
	driver.findElement(By.xpath("//li[@id='menu-item-8148']"));
	
	Actions action = new Actions(driver);
	WebElement other = driver.findElement(By.xpath("//li[@id='menu-item-8148']"));
	action.moveToElement(other).perform();
    
	System.out.println("courses successfully");
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//li[@id='menu-item-8146']")).click();
	
	


    }

@Then("^other Paid type courses page should be displayed$")
public void other_Paid_type_courses_page_should_be_displayed() throws Throwable {
	Assert.assertTrue(driver.getTitle().contains("Improve Your CSS Workflow with SASS")); 	
	System.out.println("Paid Type courses successfully");
	Thread.sleep(4000);
	
   }

@And("^Should display all the details of the Description , curriculum ,instructors and review in other Paid type courses page$")
public void should_display_all_the_details_of_the_Description_curriculum_instructors_and_review_in_other_Paid_type_courses_page() throws Throwable {
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1000)");
    boolean DescriptionEnabled = driver.findElement(By.xpath("//a[text()='Description']")).isEnabled();
    if (DescriptionEnabled==true)
    {	    	
      WebElement DescriptionHeader = driver.findElement(By.xpath("//a[text()='Description']"));
      DescriptionHeader.click();
    }
	System.out.println("Description successfully");
		Thread.sleep(4000);
		
   boolean CurriculumEnabled = driver.findElement(By.xpath("//a[text()='Description']")).isEnabled();
		    if (CurriculumEnabled==true)
		    {	    	
		      WebElement CurriculumHeader = driver.findElement(By.xpath("//a[text()='Description']"));
		      CurriculumHeader.click();
		    }
			System.out.println("Curriculum successfully");
				Thread.sleep(4000);
			
	
				boolean InstructorsEnabled = driver.findElement(By.xpath("//a[text()='Instructors']")).isEnabled();
			    if (InstructorsEnabled==true)
			    {	    	
			      WebElement InstructorsHeader = driver.findElement(By.xpath("//a[text()='Instructors']"));
			      InstructorsHeader.click();
			    }
				System.out.println("Instructors successfully");
					Thread.sleep(4000);
					
					
					boolean reviewEnabled = driver.findElement(By.xpath("//a[text()='Review']")).isEnabled();
				    if (reviewEnabled==true)
				    {	    	
				      WebElement reviewHeader = driver.findElement(By.xpath("//a[text()='Review']"));
				      reviewHeader.click();
				    }
					System.out.println("review successfully");
						Thread.sleep(4000);
			
	
		
		driver.close();
   
}
}

					
			