import java.util.Scanner;

public class QuickSort {
    
    public static void sorting(int arr[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);

            sorting(arr, startIndex, pivotIndex - 1);
            sorting(arr, pivotIndex + 1, endIndex);
        }
    }

    public static int partition(int arr[], int startIndex, int endIndex) {
        /* 
        PIVOT choises:
            (1)   Random
            (2)   median
            (3)   first element of an array
            (4)   last element of an array
        */
        int pivot = arr[endIndex];  //we have taken last element of an array
        int i = startIndex - 1 ;    //i = -1

        for (int j = startIndex; j < endIndex; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[endIndex];
        arr[endIndex] = temp;

        return i;
    }


    public static void main(String[] args) {
        
        System.out.print("Enter the number of elements:");
        Scanner scan = new Scanner(System.in);
        int elementCount = scan.nextInt();

        int arr[] = new int[elementCount];

        System.out.println("Enter " + elementCount + " elements:");
        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i < elementCount; i++) {
            arr[i] = scan1.nextInt();
        }

        sorting(arr, 0, elementCount-1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
        scan1.close();
    }
}