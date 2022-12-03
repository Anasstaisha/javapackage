import org.junit.jupiter.api.Assertions;
import ru.netology.javapackage.services.SQRService;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalcInRange() {
        SQRService service = new SQRService();

        int start = 99;
        int end = 250;
        int expected = 6;

        int result = service.calculate(start, end);
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcOutOfRange() {
        SQRService service = new SQRService();

        int start = 1;
        int end = 99;
        int expected = 0;

        int result = service.calculate(start, end);
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void shouldCalcHalfRange() {
        SQRService service = new SQRService();

        int start = 50;
        int end = 500;
        int expected = 13;

        int result = service.calculate(start, end);
        Assertions.assertEquals(expected, result);
    }

}
