package exceptions;

import static org.junit.jupiter.api.Assertions.assertThrows;
import investigation.Investigation;
import org.junit.jupiter.api.Test;
import parser.Parser;
import ui.Ui;

public class ExceptionTest {

    @Test
    public void throwInvalidSuspectExceptionTest() {
        Investigation investigation = new Investigation(new Parser(), new Ui());
        assertThrows(InvalidSuspectException.class, () -> investigation.investigateScene(0));
    }

    @Test
    public void throwInvalidClueExceptionTest() {
        Investigation investigation = new Investigation(new Parser(), new Ui());
        investigation.investigateScene(1);
        assertThrows(InvalidClueException.class, () -> investigation.investigateScene(10));
    }
}
