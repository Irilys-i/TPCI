import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddOperationTest {

    @Test
    public void testAdditionNominale() {
        Operation op = new AddOperation();
        assertEquals(5.0, op.calculate(2.0, 3.0), 0.001, "Test d'addition nominale échoué");
    }

    @Test
    public void testAdditionNegatives() {
        Operation op = new AddOperation();
        assertEquals(-5.0, op.calculate(-2.0, -3.0), 0.001, "Test d'addition avec nombres négatifs échoué");
    }

    @Test
    public void testAdditionDecimals() {
        Operation op = new AddOperation();
        assertEquals(15.5, op.calculate(12.5, 3.0), 0.001, "Test d'addition avec nombres décimaux échoué"); // يتطابق مع مثال التنفيذ المطلوب[span_2](start_span)[span_2](end_span)
    }
}