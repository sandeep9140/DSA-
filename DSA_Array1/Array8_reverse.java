import java.util.Arrays;

public class Array8_reverse {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,23};
        System.out.println(Arrays.toString(arr));
        int[] reverseArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            reverseArr[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(reverseArr));
    }
    
}
