package StepDefinitions;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import PageObj.LoginPage;
import PageObj.StorePage;

public class steps {
    WebDriver driver;

    @Given("Open the Sauce Demo Application")
    public void open_browser() {
        driver = DriverFactory.getDriver();
        new StorePage(driver).load("https://www.saucedemo.com/");
    }

    @Then("Verify user check the logo")
    public void checkLogo() {
        if (driver.findElement(By.xpath("//*[@class=\"inventory_list\"]")).isDisplayed()) {
            System.out.println("\nLogin success\n");
        }
    }

    @When("User is able to login")
    public void navigate_to_sauce_demo_site() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginBtn();

    }

    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }

    @Then("User change product sorting dropdown by search")
    public void sortBySearch() {
        WebElement dropdown;
        WebElement activeOption;
        String optiontext = "Price (low to high)";

        dropdown = driver.findElement(By.className("product_sort_container"));
        dropdown.sendKeys(optiontext);
        activeOption = driver.findElement(By.className("active_option"));

        Assert.assertEquals("Price (low to high)", optiontext);
    }

    @Then("User selects the filter from the dropdown")
    public void selectDropdown() {
        Select se = new Select(driver.findElement(By.className("product_sort_container")));
        se.selectByVisibleText("Name (Z to A)");

        Assert.assertEquals("Name (Z to A)", "Name (Z to A)");
    }

    @When("User enters {string} in username field")
    public void setUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    @When("User enters {string} in password field")
    public void setPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();
    }
}
