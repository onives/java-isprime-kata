public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if (num == 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (isDivisibleBy(num, 2) || isDivisibleBy(num, 3) || isDivisibleBy(num, 5)){
            return false;
        }
        return true;
    }

    public static boolean isDivisibleBy(int num, int divisor){
        return num % divisor == 0;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
