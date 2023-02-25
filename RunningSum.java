import java.util.Arrays;

public class RunningSum {

    public static void sum(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }   
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        sum(arr);
    }
}