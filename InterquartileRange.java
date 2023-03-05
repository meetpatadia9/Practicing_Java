/*
!                   Interquartile Range(IQR)
*/

/*
?       In descriptive statistics, the Interquartile Range is a measure of statistical dispersion, 
?       which is the spread of the data. The IQR may also be called the midspread, middle 50%, 
?       fourth spread, or H‑spread. It is defined as the difference between the 75th and 25th 
?       percentiles of the data 
*/

/*
*    [ -7 | 1 | 5 | 2 | -4 | 3 | 0 ]
!          ↥        ↥        ↥
!         Q1       Q2       Q3         
    suppose we have array as above, so 50% of that we'll be Q2.
    now, we'll find MID value of lower-half(start to mid) which is Q1,
    and upper-half(mid to end) which is Q3.

    and, IQR will be (Q3-Q1)
*/
import java.util.*;
import java.util.Scanner;

public class InterquartileRange {

    public static void IRQ(int arr[]) {
        /*
            Q1 -> median of lower half
            Q2 -> median of data
            Q3 -> median of upper half
            IQR = (q3-q1)
        */
        Arrays.sort(arr);

        int q1, q2, q3, iqr;

        int start = 0;
        int end = arr.length;
        
        q2 = start + (end - start) / 2;
        System.out.println("Q2 = " + arr[q2]);

        q1 = (start + (q2-1)) / 2;
        System.out.println("Q1 = " + arr[q1]);

        q3 = ((q2+1) + end) / 2;
        System.out.println("Q3 = " + arr[q3]);
       
        iqr = arr[q3]-arr[q1];

        System.out.println("IQR = " + iqr);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter number of elements you want to enter:");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        Scanner scan2 = new Scanner(System.in);
        for(int i=0; i<size; i++) {
            arr[i] = scan2.nextInt();
        }

        // int arr[] = {1,2,5,6,7,9,12,15,18,19,27};

        IRQ(arr);

        scan1.close();
        scan2.close();
    }
}