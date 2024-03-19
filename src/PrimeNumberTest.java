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

    @Test
    public void testSix(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(6));
    }
    @Test
    public void testEight(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(8));
    }
    @Test
    public void test9(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(9));
    }
    @Test
    public void test15(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(15));
    }
    @Test
    public void test21(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(21));
    }
    @Test
    public void test25(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(25));
    }
    @Test
    public void test35(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(35));
    }
    @Test
    public void test55(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(55));
    }
    @Test
    public void test1(){
        Assertions.assertEquals(false, PrimeNumber.isPrimeNumber(1));
    }
}
