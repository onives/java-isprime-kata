public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        } else if (num == 9){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
