import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TestMetod extends MainTest{

    public final SelenideElement column_a = $x("//*[@id='column-a']");
    public final SelenideElement column_b = $x("//*[@id='column-b']");
    public final SelenideElement moving = $x("//div[contains(@id,'columns')]/div[1]");

    public void dragAndDrop(){
    column_a.dragAndDropTo(column_b);
    }

    public void ChekingDragAndDrop(){
        moving.shouldHave(Condition.text("B"));
    }
}
