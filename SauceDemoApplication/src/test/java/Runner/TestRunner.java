package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                plugin = {"pretty","html:target/cucumber.html"},
                glue = {"StepDefinitions", "MyHooks"},
                features = {"src/test/java/Features/"}
)

public class TestRunner {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }
}
