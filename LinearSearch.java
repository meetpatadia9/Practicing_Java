public class LinearSearch {
    
    public static void findElement(int arr[], int size, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Poss= " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {3,1,7,9,8,2};
        int size = arr.length;
        int key = 9;

        findElement(arr, size, key);
    }
}
