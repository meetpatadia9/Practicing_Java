import java.util.Scanner;

public class MinMaxProblem {

    public static void findMinMax(int arr[]) {
        int min = arr[0];
        int max = arr[1];

        if(min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array:");
        Scanner scan2 = new Scanner(System.in);
        for(int i=0; i < size; i++) {
            arr[i] = scan2.nextInt();
        }

        findMinMax(arr);

        scan1.close();
        scan2.close();
    }
}
