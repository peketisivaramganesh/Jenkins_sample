import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\Test\Resources",
        format = {"json:target/cucumber.json"}
)
public class CucumberTest {
}