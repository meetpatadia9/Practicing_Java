import java.util.Scanner;

/*
 !                            Permutations
*/

class Permutations {
    
    public static void makePossiblePermutations(String str, String perm, int index) {

        if(str.length() == 0) {
            System.out.println(perm);
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            /*        ||
                here, we created a 'newString' variable to contain string that does not contain current character,
                    Ex.: we have string 'ABC' and 'B' is already placed ar first place and 'AC' is ramaining.
                         as 'B' is already placed we remove it from our main string so 'B' does not repeat.
                         so 'newString' variable will contain 'A' and 'C' only avoiding 'B'(current variable).
            */
            makePossiblePermutations(newString, perm + currChar, index+1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter string:");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        System.out.println("Possible Permutations:");

        makePossiblePermutations(str, "", 0);
        /*
         ?      so here, we are passing our string(str), permutation string(perm) which is null and index(0)
        */

        scan.close();
    }
}
