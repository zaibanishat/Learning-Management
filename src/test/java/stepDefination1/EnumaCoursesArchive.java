package stepDefination1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class EnumaCoursesArchive extends Base {
	WebDriver driver ;
	
	
	@And("^clicks on  courses archive in the Courses dropdown$")
	public void clicks_on_courses_archive_in_the_Courses_dropdown() throws Throwable {
		Thread.sleep(6000);
		driver.findElement(By.xpath("//li[@id='menu-item-8148']"));
		
		Actions action = new Actions(driver);
		WebElement archive = driver.findElement(By.xpath("//li[@id='menu-item-8148']"));
		action.moveToElement(archive).perform();
        
		System.out.println("courses successfully");
		//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//li[@id='menu-item-8131']")).click();
		System.out.println("Courses archive successfully");
		Thread.sleep(3000);
	}
	@Then("^All the courses should be displayed$")
	public void ThenAllthecoursesshouldbedisplayed() throws Throwable{
		driver.close();
	}

	}

	