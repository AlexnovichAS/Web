package ru.edujira.JiraSteps;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;
import static ru.edujira.PageElements.TaskPageElements.headerH1;
import static ru.edujira.PageElements.TaskPageElements.taskDetails;

public class TaskPage {

    @Step("Проверка значения: '{result}', у свойства '{name}' в деталях задачи")
    public static void checkTaskDetailsInTask(String name, String result) {
        String detailsResult = taskDetails(name)
                .waitUntil(exactText(result), 10000)
                .should(exist, Duration.ofSeconds(10))
                .getText().toLowerCase().trim();
        Assertions.assertEquals(result.toLowerCase(), detailsResult,
                "Ошибка, в поле задачи: " + name + " указано: " + detailsResult);
    }

    @Step("Проверка перехода в задачу: {nameTask}")
    public static void checkNameTaskInTask(String nameTask) {
        String header = headerH1.getText();
        Assertions.assertEquals(nameTask, header, "Ошибка, найдена задача:" + header + "ожидалась: " + nameTask);
    }
}
