import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void selenideSearchTest() {
        Configuration.headless = true;
        Configuration.browser = "FIREFOX";
        // Открыть https://google.com
        open("https://google.com");
        // Ввести "Selenide" в поле поиска
        $("[name=q]").setValue("Selenide").pressEnter();
//         Проверить, что "selenide.org" появилось в результатах поиска
        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
//        123456
    }
}
