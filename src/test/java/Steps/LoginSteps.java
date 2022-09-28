package Steps;

import Elements.Login;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import org.junit.jupiter.api.Assertions;
import utils.Configuration;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginSteps extends Login {
    @Дано ("^открываем главную страницу Jira")
    public static void openUrl(){open("https://edujira.ifellow.ru/login.jsp");
    }

    @Когда("^Логинимся")
        public static void loginMethod() {
                login.shouldBe(visible, Duration.ofSeconds(60)).setValue(Configuration.getConfigurationValue("login"));
                password.setValue(Configuration.getConfigurationValue("password"));
                loginIn.click();

                //проверка на ошибку входа
              String elemVal = assertPR.shouldBe(visible,Duration.ofSeconds(60) ).getText();
              Assertions.assertEquals(elemVal, "System Dashboard", "Ошибка ввода");
        }
}