import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PrimeNumberTest {

    @Test
    public void testTwo(){
        Assertions.assertEquals(true, PrimeNumber.isPrimeNumber(2));
    }
    @Test
    public void testFour(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(4));
    }
}
