package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_steps {
	
	WebDriver driver;

	@Given("I am on Amazon Homepage")
	public void i_open_the_amazon_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}

	@When("I click on signin button")
	public void I_click_on_signin_button() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Then("I will be on Signin Page and Capture the title of the page")
	public void i_will_be_on_signin_page_and_capture_the_title_of_the_page() {
		System.out.println("title of the is page is : "+ driver.getTitle());
	}

		@Then("I entered email id as {string} on the page")
	public void i_enter_email_id_as_seleniumdemo_gmail_com_on_the_page(String emailId) {
		driver.findElement(By.id("ap_email")).sendKeys(emailId);
		//driver.findElement(By.xpath("//input[@id='continue']")).click();

	}
	@Then("I clicked on Continue button")
	public void i_clicked_on_continue_button() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("I entered password as {string} on the page")
	public void i_enter_password_as_on_the_page(String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
	}

	@Then("I click on submit button")
	public void i_click_on_submit_button() {
		driver.findElement(By.id("signInSubmit")).click();
	} 

	@Then("I start searching item")
	public void I_start_searching_item() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Shirts");
		driver.findElement(By.id("twotabsearchtextbox")).submit();

	}

	@Then("now i click on searched item")
	public void now_i_click_on_searched_item() {
		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
	}

	/*@Then("i add the item to wishlist for further booking")
	public void i_add_the_item_to_wishlist_for_further_booking() {
		driver.findElement(By.id("wishlistButtonStack")).click();
	}*/

	@Then("i close the browser")
	public void i_close_the_browser() {
		driver.close();
	}

}






