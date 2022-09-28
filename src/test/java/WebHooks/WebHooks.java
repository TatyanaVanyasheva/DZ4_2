package WebHooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;

//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;

public class WebHooks {
    @Before
    public static void SetUp() {
        Configuration.startMaximized=true;
    }
    @After
    public void webClose(){
        WebDriverRunner.closeWebDriver();
    }
}
