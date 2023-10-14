/*---///-----///---*/
import static org.junit.Assert.*;
import org.junit.Test;
/*---///-----///---*/


/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
public class TestPatient {
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
@Test
    public void testValidPatID() {
    Patient patient = new Patient("AB12345678", "Max", "Mustermann");
    assertEquals("AB12345678", patient.getPatID());
    }
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
@Test
    public void testInvalidPatID() {
    Patient patient = new Patient("InvalidID", "John", "Doe");
    assertNull(patient.getPatID());
    }
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
@Test
    public void testMissingVorname() {
        Patient patient = new Patient("EF12345678", null, "Smith");
        assertNull(patient.getVorname());
    }
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
@Test
    public void testMissingNachname() {
        Patient patient = new Patient("GH12345678", "David", null);
        assertNull(patient.getNachname());
    }
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/









}
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/