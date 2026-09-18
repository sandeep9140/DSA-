import java.util.Arrays;

public class Array8_prefixSum {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};

        int[] pre=new int[arr.length];

        pre[0]=arr[0];
    
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pre));

    }
    
}
