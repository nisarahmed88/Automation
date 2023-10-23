package MyHooks;

import DriverFactory.DriverFactory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @Before
    public void before(){
        driver = DriverFactory.initializeDriver();
    }

    @After
    public void after(){
        driver.quit();
    }
}
