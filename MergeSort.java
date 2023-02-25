import java.util.Scanner;

public class MergeSort {

    public static void devide(int arr[], int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        //      int mid = (startIndex + endIndex) / 2;
        /* 
                if array elements are huge, then value of 'int' can go out of range.
                so to avoid space complexity, we should use ...
        */
        int mid = startIndex + (endIndex - startIndex) / 2;
        devide(arr, startIndex, mid);
        devide(arr, mid+1, endIndex);
        conquer(arr, startIndex, endIndex, mid);
    }

    public static void conquer(int arr[], int startIndex, int endIndex, int mid) {
        int mergedArray[] = new int[(endIndex-startIndex)+1];
        int index1 = startIndex;    //tracking frist array 
        int index2 = mid + 1;       //tracking second array
        int i=0;                    //tracking  mergedArray's index

        //loop to check both array's elements 
        while (index1 <= mid && index2 <= endIndex) {
            if (arr[index1] <= arr[index2]) {
                mergedArray[i] = arr[index1];
                i++;
                index1++;
            }
            else {
                mergedArray[i] = arr[index2];
                i++;
                index2++;
            }
        }

        //first array's element 
        while (index1 <= mid) {
            mergedArray[i] = arr[index1];
            i++;
            index1++;
        }

        //second array's element 
        while (index2 <= endIndex) {
            mergedArray[i] = arr[index2];
            i++;
            index2++;
        }

        for(int x=0, y = startIndex; x<mergedArray.length; x++, y++) {
            arr[y] = mergedArray[x];
        }
    }

    public static void main(String[] args) {
        
        System.out.print("Enter number of elements you want to enter:");
        Scanner scan = new Scanner(System.in);
        int inputCount = scan.nextInt();

        int inputData[] = new int[inputCount];

        System.out.println("Enter " + inputCount + " number of elements:");
        Scanner  scan1 = new Scanner(System.in);
        for (int i = 0; i < inputCount; i++) {
            inputData[i] = scan1.nextInt();
        }

        devide(inputData, 0, inputCount-1);

        System.out.println("Sorted Array:");
        for (int i = 0; i<inputCount; i++) {
            System.out.println(inputData[i]);
        }

        scan.close();
        scan1.close();
    }
}