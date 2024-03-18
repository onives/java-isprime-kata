import org.junit.*;

public class IsPrimeTest {
    @Test 
    public void test(){
        Assert.assertEquals(false, IsPrime.isPrime(1));
    }
}
