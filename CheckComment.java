import java.util.*;

public class CheckComment {
    
    public static void isComment(String str, int size) {
        
        for (int i = 0; i < size; i++) {
            if (str.charAt(0) == '/' && str.charAt(1) == '/') {
                System.out.println("This is Single Line Comment");
                break;
            }
            else if (str.charAt(0) == '/' && str.charAt(1) == '*' && str.charAt(size-2) == '*' && str.charAt(size-1) == '/') {
                System.out.println("This is Multi Line Comment");
                break;
            }
            else {
                System.out.println("This is not a Comment");
                break;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter String:");
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int size = str.length();

        isComment(str, size);

        scan.close();
    }
}