package selenide2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class OpenGitHub {
    @Test
    void selenideTest (){
        //открыть сайт GitHub
        open("https://github.com/");
        //на главной странице GitHub выбрать меню Solutions + hover
        $(".header-menu-wrapper").$(Selectors.byText("Solutions")).hover();
        //перейти в меню Enterprize
        $(".border-bottom").$("a[href='/enterprise']").click();
        //загрузилась нужная страница
        $(".h0-mktg").shouldHave(Condition.text("Let’s build from here"));
    }
}
