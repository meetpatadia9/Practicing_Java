/*
 !                    Segregation or Filtering
*/

/*
    Segregation means partition. 

    [ 1 | 1 | 0 | 1 | 0 | 1 | 0 ]
    suppose we have this array and we want output like this 
    [ 0 | 0 | 0 | 1 | 1 | 1 | 1 ]
*/

import java.util.Scanner;

public class Segregation {
    
    public static void segregate(int arr[], int length) {
        
        int counter = 0;
        
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        
        //fills the arr with 0 until count
        for (int i = 0; i < counter; i++) {
            arr[i] = 0;
        }
        
        //fills the remaining space of arr with 1 until length
        for (int i = counter; i < length; i++) {
            arr[i] = 1;
        }  
        
        System.out.println("Array after Segregation: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");            
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Enter number to elements you want to enter: ");
        Scanner s1 = new Scanner(System.in);
        int size = s1.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements: ");
        Scanner s2 = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = s2.nextInt();            
        }

        int len = arr.length;

        segregate(arr, len);

        s1.close();
        s2.close();
    }
}