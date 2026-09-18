import java.util.Arrays;

public class Array10_swap {

    public static  void swap(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={10,30,403,20};
        System.out.println("first=================");
        System.out.println(Arrays.toString(arr));
        swap(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


        
    }
    
}
