import org.junit.Test;

public class MainTest  extends  MainSettings{
    private final static String BASE_URL = "https://the-internet.herokuapp.com/drag_and_drop";

    @Test
    public void chkingValidValue(){
        –°onnectionSite connectionSite = new –°onnectionSite(BASE_URL);
        TestMetod testMetod = new TestMetod();
        testMetod.dragAndDrop();
        testMetod.ChekingDragAndDrop();

    }
}
