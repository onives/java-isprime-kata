import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class IsPrimeTest {
    @Test 
    // should return false for number 1
    public void testOne(){
        Assertions.assertEquals(false, IsPrime.isPrime(1));
    }

    @Test
    public void testTwo(){
        Assertions.assertEquals(true, IsPrime.isPrime(2));
    }
}
