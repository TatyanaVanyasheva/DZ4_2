package Steps;

import Elements.Main;
import io.cucumber.java.ru.И;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
public class MainSteps extends Main{
    @И("^Переходим к проекту")
    public static void MainMethod(){
        proj.shouldBe(visible, Duration.ofSeconds(60)).click();
        testProj.shouldBe(visible, Duration.ofSeconds(60)).click();
        taskProj.shouldBe(visible, Duration.ofSeconds(60)).click();
    }
    @И("^Проверяем количеcтво задач")
    public static void QuantityTask(){
        String numberTask=numbProj.getText();
        System.out.println("Колличество задач всего: "+numberTask);
    }
}
