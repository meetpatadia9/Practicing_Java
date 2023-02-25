/*
 !                      Equilibrium Point
*/

/*
    Equilibrium Point in array is a position such that,
    the sum of elements before it is equal to the sum of after it.

    In simple words, Equilibrium Point is an index such that,
    the sum of elements of right side is equal to sum of left.
*/

/*
?    [ -7 | 1 | 5 | 2 | -4 | 3 | 0 ]
    suppose we have array as above, so Equilibrium Point will be [2].
    bcz, sum of its left elements [-7 | 1 | 5] is '-1' and 
    sum of right elements [-4 | 3 | 0] is also '-1'.
*/

import java.util.Scanner;

public class EquilibriumPoint {

    int equilibrium(int arr[], int size) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                leftSum += arr[i - 1];
            }

            if (totalSum - leftSum - arr[i] == leftSum) {
                System.out.println("Equilibrium Point is:");
                return arr[i];
            }
        }
        return -1;
    }

    // int equilibrium(int arr[], int size) {
    //     int i, j;
    //     for(i=0; i < size; i++) {

    //         //for LEFT-SIDE of Sum
    //         int leftsum = 0;
    //         for(j=0; j<i; j++) {
    //             leftsum = leftsum + arr[j];
    //         }

    //         //for RIGHT-SIDE of Sum
    //         int rightsum = 0;
    //         for(j=i+1; j < size; j++) {
    //             rightsum = rightsum + arr[j];
    //         }

    //         //compare both side
    //         if(leftsum == rightsum) {
    //             System.out.println("Equilibrium Point is:");
    //             return i;
    //         }
    //     }
    //     //if EQUILIBRIUM POINT is not Found
    //     return -1;
    // }

    public static void main(String[] args) {
        EquilibriumPoint ep = new EquilibriumPoint();

        System.out.println("Enter size of array:");
        
        Scanner scan =  new Scanner(System.in);
        int num = scan.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter elements:");
        for(int i=0; i<num; i++) {
            arr[i] = scan.nextInt();
        }

        int arr_size = arr.length;

        System.out.println(ep.equilibrium(arr, arr_size));

        scan.close();
    }
    
}
