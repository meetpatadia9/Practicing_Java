import java.util.Scanner;

public class SelectionSort {

    public static void sortArray(int arr[]) {

        for(int i=0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
