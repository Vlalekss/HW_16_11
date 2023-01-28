package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {

    @Test
    void checkSelenideSearchJUnit5Test () {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $(".wiki-pages-box").find(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("JUnit5"));
        sleep(10000);
    }
}

