import org.junit.Test;

public class MainTest  extends  MainSettings{
    private final static String BASE_URL = "https://the-internet.herokuapp.com/drag_and_drop";

    @Test
    public void chkingValidValue(){
        СonnectionSite connectionSite = new СonnectionSite(BASE_URL);
        TestMetod testMetod = new TestMetod();
        testMetod.dragAndDrop();
        testMetod.ChekingDragAndDrop();

    }
}
