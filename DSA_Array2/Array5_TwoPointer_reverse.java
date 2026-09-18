import java.util.Arrays;

public class Array5_TwoPointer_reverse {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int left=0;
        int right=arr.length-1;

        System.out.println("original  Array:- " +Arrays.toString(arr));
        while (left < right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
            
        }
        System.out.println("reverse   Array:- " +Arrays.toString(arr));
    }
    
}
