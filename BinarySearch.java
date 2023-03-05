import java.util.Scanner;

public class BinarySearch {

    public static void searchElement(int arr[], int lenght, int key) {
        int start = 0;
        int end = lenght - 1;
        int mid = (start + end) / 2;

        while( start <= end ){  
            if ( arr[mid] < key ){  
                start = mid + 1;     
            }else if ( arr[mid] == key ){  
                System.out.println("Element is found at index: " + mid);  
                break;  
            }else{  
                end = mid - 1;  
            }  
            mid = (start + end)/2;  
        }  
        
        if ( start > end ){  
            System.out.println("Element is not found!");  
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of elements you want to enter:");
        
        Scanner scan =  new Scanner(System.in);
        int numOfElements = scan.nextInt();

        int sortedData[] = new int[numOfElements];
        int n = sortedData.length;

        System.out.println("Enter " + numOfElements + " elements:");
        for(int i = 0; i < numOfElements; i++) {
            sortedData[i] = scan.nextInt();
        }

        System.out.print("Enter element you want to search:");
        Scanner scan1 = new Scanner(System.in);
        int key = scan1.nextInt();

        searchElement(sortedData, n, key);
        
        scan.close();
        scan1.close();
    }
}