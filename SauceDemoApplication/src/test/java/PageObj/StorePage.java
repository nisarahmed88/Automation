package PageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorePage extends BasePage {
    @FindBy(xpath ="//a[@class=\"shopping_cart_link\"]") private WebElement cartIconBtn;

    public StorePage(WebDriver driver) {
        super(driver);

    }
}
