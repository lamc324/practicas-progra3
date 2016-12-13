import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JPanelFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import practicaswing.Practicaswing;

/**
 *
 * @author Estudiante
 */
public class Lab2JUnitTest {

    private FrameFixture window;
    private JPanelFixture panel;

    public Lab2JUnitTest() {
    }

    @Before
    public void setUp() {
        Practicaswing frame = GuiActionRunner.execute(() -> new Practicaswing());
        window = new FrameFixture(frame);
        window.show();
        panel = window.panel("Form");
    }

    @Test
    public void testVisibleComponents() {
        panel.label("lblName").requireVisible();
        panel.label("lblPhone").requireVisible();
        panel.label("lblGender").requireVisible();
        panel.label("lblResult").requireVisible();


        panel.button("ok").requireVisible();
        panel.button("clean").requireVisible();
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }
}