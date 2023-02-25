public class RecEx1 {

    public static void factorial(int num) {

        if (num == 1) {
            return 1;
        }

        int intermediat = factorial(num - 1);
        int result = num * intermediat;

        return result;
    }

    public static void main(String[] args) {
        
        int num = 5;
        factorial(num);
    }
    
}
