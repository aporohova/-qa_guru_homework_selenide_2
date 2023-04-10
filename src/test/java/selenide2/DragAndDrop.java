package selenide2;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDrop {
    @Test
    //вариант с actions() не работает в selenide
    void testWithActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-b").shouldHave(Condition.text("B"));
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }
    @Test
    //рабочий вариант с DragAndDrop
    void testWithDragAndDrop () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-b").shouldHave(Condition.text("B"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }
}
