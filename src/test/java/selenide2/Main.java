package selenide2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Main {
    @Test
    void selenideTest (){
        open("https://github.com/");
        $(".header-menu-wrapper").$(Selectors.byText("Solutions")).hover();
        $(".border-bottom").$("a[href='/enterprise']").click();
        $(".h0-mktg").shouldHave(Condition.text("Let’s build from here"));
    }
}
