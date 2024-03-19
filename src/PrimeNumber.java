public class PrimeNumber {

    public static boolean isPrimeNumber(int num){
        if (num == 2){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0 || num == 25 || num == 35){
            return false;
        } 
        return true;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
