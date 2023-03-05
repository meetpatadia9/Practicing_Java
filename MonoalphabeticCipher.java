import java.util.Scanner;

class MonoalphabeticCipher {

    public static char normalChar[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                                        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
                                        'u', 'v', 'w', 'x', 'y', 'z' };

    public static char codedChar[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P',
                                        'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z',
                                        'X', 'C', 'V', 'B', 'N', 'M' };


    //  DATA ENCRYPTION 
    public static String stringEncryption(String str)
    {
        String encryptedString = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (str.charAt(i) == normalChar[j])
                {
                    encryptedString = encryptedString + codedChar[j];
                    break;
                }
                if (str.charAt(i) < 'a' || str.charAt(i) > 'z')
                {
                    encryptedString = encryptedString + str.charAt(i);
                    break;
                }
            }
        }
        System.out.println("Encrypted Message: "+ encryptedString);
        return encryptedString;
    }

    //  DATA DECRYPTION
    public static String stringDecryption(String str)
    {
        String decryptedString = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (str.charAt(i) == codedChar[j])
                {
                    decryptedString = decryptedString + normalChar[j];
                    break;
                }
                if (str.charAt(i) < 'A' || str.charAt(i) > 'Z')
                {
                    decryptedString = decryptedString + str.charAt(i);
                    break;
                }
            }
        }
        System.out.println("Decrypted Message: "+ decryptedString);
        return decryptedString;
    }

    public static void main(String args[])
    {
        System.out.println("Enter Message: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        stringEncryption(str.toLowerCase());
        System.out.println("Original Message: " + str);
        scan.close();
    }
}