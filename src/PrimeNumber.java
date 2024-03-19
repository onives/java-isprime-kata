public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if(isDivisibleBy(num, i)){
                return false;
            }
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
