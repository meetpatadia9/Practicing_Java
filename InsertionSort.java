import java.util.Scanner;

public class InsertionSort {
    
    public static void sortArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while ((j >= 0) && (current < arr[j])) {
                arr[j+1] = arr[j];      //pushing element to right side
                j--;
            }

            arr[j+1] = current;         //placing current(small) element at blank place 
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

        sortArray(arr);

        System.out.println("Sorted Array:");
        for(int m=0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }

        scan1.close();
        scan2.close();
    }
}