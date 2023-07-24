package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("User should navigate to the application")
	public void userShouldNavigateToTheApplication() {
		  System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver_win32\\chromedriver.exe"); 
		  ChromeOptions options=new ChromeOptions(); 
		  options.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(options); 
		 
		  driver.get("https://magento.softwaretestingboard.com/");
		  driver.manage().window().maximize(); 
	}
	@Given("User clicks on the Signin button")
	public void userClicksOnTheSigninButton() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
	}
	@Given("User enters the email as {string}")
	public void userEntersTheEmailAs(String email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	}
	@Given("User enters the password {string}")
	public void userEntersThePassword(String password) {
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys(password);
	}
	@When("User clicks on the Sign In button")
	public void userClicksOnTheSignInButton() {
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[4]/div[1]/button[1]")).click();
	}
	@Then("the Sign In should be success")
	public void theSignInShouldBeSuccess() {
		WebElement textElement=driver.findElement(By.xpath(" //header/div[1]/div[1]/ul[1]/li[1]/span[1]"));
		String text = textElement.getText();
		System.out.println("Value:Welcome, Nancy Leema Karunakaran! " + text);
	}

}
