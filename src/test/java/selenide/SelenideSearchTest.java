package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {

    @Test
    void checkSelenideSearchJUnit5Test () {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body ul").shouldHave(text("Soft assertions"));
        $$("#wiki-body ul a").findBy(href("/selenide/selenide/wiki/SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("Using JUnit5"));
        sleep(10000);
    }
}

