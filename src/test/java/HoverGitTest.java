import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverGitTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://github.com";
    }
    @Test
    void GitPageTest() {
        open("/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprises")).click();
        $(".enterprise-hero-heading").shouldHave(text("The AI-powered developer platform"));
}

}
