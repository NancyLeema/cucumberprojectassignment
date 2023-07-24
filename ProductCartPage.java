package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductCartPage {
	WebDriver driver;
	@Given("User should navigate to the application page")
	public void userShouldNavigateToTheApplicationPage() {
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver_win32\\chromedriver.exe"); 
		  ChromeOptions options=new ChromeOptions(); 
		  options.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(options); 
		 
		  driver.get("https://magento.softwaretestingboard.com/");
		  driver.manage().window().maximize(); 
	}
	@Given("User clicks on the Signin link button")
	public void userClicksOnTheSigninLinkButton() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}
	@Given("User enters the emailid as {string}")
	public void userEntersTheEmailidAs(String emailid) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
	}
	@Given("User enters the passwordid {string}")
	public void userEntersThePasswordid(String passwordid) {
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(passwordid);
	}
	@Given("User should click on the signin button")
	public void userShouldClickOnTheSigninButton() {
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")).click();
	}
	@Given("User click on the women")
	public void userClickOnTheWomen() {
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Women')]"));
		action.moveToElement(element).build().perform();
	}
	@Given("User should select the tops option")
	public void userShouldSelectTheTopsOption() {
		Actions action1=new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
		action1.moveToElement(element1).build().perform();
	}
	@Given("User should select jacket option from the tops option")
	public void userShouldSelectJacketOptionFromTheTopsOption() {
		driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/span")).click();
	}
	@Given("User should select  any of the jacket")
	public void userShouldSelectAnyOfTheJacket() {
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")).click();
	}
	@Given("User should select the size of the jacket")
	public void userShouldSelectTheSizeOfTheJacket() {
		driver.findElement(By.id("option-label-size-143-item-167")).click();
	}
	@Given("User hould select the color of the jacket")
	public void userHouldSelectTheColorOfTheJacket() {
		driver.findElement(By.id("option-label-color-93-item-50")).click();
	}
	@When("User click on Add To Cart")
	public void userClickOnAddToCart() {
		driver.findElement(By.id("product-addtocart-button")).click();
	}
	@Then("The cart badge shoould be updated")
	public void theCartBadgeShoouldBeUpdated() {
		System.out.println("loginPage");
	}

}
