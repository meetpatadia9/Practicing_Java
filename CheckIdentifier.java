import java.util.Scanner;

public class CheckIdentifier {
    
    public static void isValid(String str, int size) {

        if(!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || 
        (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') ||
        (str.charAt(0) == '_'))) {

            if(!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z') ||
            (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') ||
            (str.charAt(0) == '_'))) {
                System.out.println("Invalid Identifier!!");
            }
            else {
                System.out.println("Valid Identifier!!");
            }

        }
        else {
            System.out.println("Valid Identifier!!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter Identifier:");
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int size = str.length();

        isValid(str, size);

        scan.close();
    }
}