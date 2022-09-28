package Steps;

import Elements.Proj;
import io.cucumber.java.ru.И;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;

public class ProjSteps extends Proj {
    @И("Переходим в задачу TestSelenium и проверяем статус и привязку к версии")
    public static void ProjMethod() {
        search.shouldBe(visible, Duration.ofSeconds(60));
        search.setValue("TestSelenium_bug").pressEnter();
        String statZ = status.getText();
        System.out.println("Статус задачи:" + statZ);
        String versZ = version.getText();
        System.out.println("Версия:" + versZ);

        Assertions.assertEquals(statZ, "СДЕЛАТЬ", "ошибка");
        Assertions.assertEquals(versZ, "Version 2.0", "ошибка");

        create.click();
        createTask.shouldBe(visible, Duration.ofSeconds(60));
    }
}
