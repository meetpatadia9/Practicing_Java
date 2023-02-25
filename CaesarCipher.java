import java.util.Scanner;

public class CaesarCipher {
    
    //          DATA ENCRYPTION
    public static void dataEncrypt(String str, int key) {
        StringBuffer encryptStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ((((int)str.charAt(i)) >= 97 && ((int)str.charAt(i)) < 120) ||
                (((int)str.charAt(i)) >= 65 && ((int)str.charAt(i)) < 88) ||
                (((int)str.charAt(i)) >= 48 && ((int)str.charAt(i)) < 55)) {
                char c1 = (char)((int)str.charAt(i) + key);
                encryptStr.append(c1);
            }
            else if (((int)str.charAt(i)) >= 120) {
                int c2 = ((int)str.charAt(i) - 26) + key;
                char c3 = (char) c2;
                encryptStr.append(c3);
            }
            else if (((int)str.charAt(i)) >= 88) {
                int c4 = ((int)str.charAt(i) - 26) + key;
                char c5 = (char) c4;
                encryptStr.append(c5);
            }
            else if (((int)str.charAt(i)) >= 55) {
                int c4 = ((int)str.charAt(i) - 10) + key;
                char c5 = (char) c4;
                encryptStr.append(c5);
            }
            else if (((int)str.charAt(i)) >= 32 && ((int)str.charAt(i)) <= 47 ||
                    ((int)str.charAt(i)) >= 58 && ((int)str.charAt(i)) <= 64 ||
                    ((int)str.charAt(i)) >= 91 && ((int)str.charAt(i)) <= 96 ||
                    ((int)str.charAt(i)) >= 123 && ((int)str.charAt(i)) <= 126 ) {
                // int c4 = ((int)str.charAt(i));
                char c5 = str.charAt(i);
                encryptStr.append(c5);
            }
        }
        System.out.println("Encrypted Message: " + encryptStr);
        dataDecrypt(encryptStr, key);
    }

    //          DATA DECRYPTION
    public static StringBuffer dataDecrypt(StringBuffer str, int key) {
        StringBuffer decryptStr = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ((((int)str.charAt(i)) > 100 && ((int)str.charAt(i)) <= 122) ||
                (((int)str.charAt(i)) > 67 && ((int)str.charAt(i)) <= 90) ||
                (((int)str.charAt(i)) > 50 && ((int)str.charAt(i)) <= 57)) {
                char c1 = (char)((int)str.charAt(i) - key);
                decryptStr.append(c1);
            }
            else if (((int)str.charAt(i)) <= 100 && ((int)str.charAt(i)) > 64) {
                int c2 = ((int)str.charAt(i) - key) + 26;
                char c3 = (char) c2;
                decryptStr.append(c3);
            }
            else if (((int)str.charAt(i)) <= 67 && ((int)str.charAt(i)) > 64) {
                int c4 = ((int)str.charAt(i) - key) +26;
                char c5 = (char) c4;
                decryptStr.append(c5);
            }
            else if (((int)str.charAt(i)) <= 50 && ((int)str.charAt(i)) > 64) {
                int c4 = ((int)str.charAt(i) - key) + 26;
                char c5 = (char) c4;
                decryptStr.append(c5);
            }
            else if (((int)str.charAt(i)) >= 32 && ((int)str.charAt(i)) <= 47 ||
                    ((int)str.charAt(i)) >= 58 && ((int)str.charAt(i)) <= 64 ||
                    ((int)str.charAt(i)) >= 91 && ((int)str.charAt(i)) <= 96 ||
                    ((int)str.charAt(i)) >= 123 && ((int)str.charAt(i)) <= 126 ) {
                int c4 = ((int)str.charAt(i));
                char c5 = (char) c4;
                decryptStr.append(c5);
            }
        }
        System.out.println("Original Message:" + decryptStr);
        return decryptStr;
    }

    public static void main(String[] args) {
        String inputText;
        System.out.println("Enter your message:");
        Scanner scan = new Scanner(System.in);
        inputText = scan.nextLine();
        dataEncrypt(inputText, 3);
        scan.close();
    }
}