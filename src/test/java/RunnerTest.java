import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"WebHooks", "Elements", "Steps"},
        features = "src/test/resources/features"
        //tags = {"@Test", "@Test1", "@Test2", "@Test3", "@Test4", "@Test5"}//не работает перечисление
)

public class RunnerTest {
}