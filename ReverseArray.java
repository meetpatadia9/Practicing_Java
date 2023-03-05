import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        
        int len = arr.length;
        int start = 0;
        int end = len-1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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

        reverseArray(arr);

        System.out.println("Sorted Array:");
        for(int m=0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }

        scan1.close();
        scan2.close();
    }
}