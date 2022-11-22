import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.services.SquareService;

public class SquareServiceTest {
    @Test
    public void testRangeLimit() {

        SquareService service = new SquareService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.calculate(min, max);
        //System.out.println(range);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimit() {
        SquareService service = new SquareService();
        int min = 100;
        int max = 400;
        int expected = 11;
        int actual = service.calculate(min, max);
        // System.out.println(range);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testRange() {
        SquareService service = new SquareService();
        int min = 100;
        int max = 200;
        int expected = 5;
        int actual = service.calculate(min, max);
        //System.out.println(range);
        Assertions.assertEquals(expected, actual);
    }

}

