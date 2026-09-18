import java.util.Arrays;

public class Array7_remove_duplicate {
    public static  void duplicate(int[] arr){
        if(arr.length==0){
            System.out.println("blank array");
        }

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("removed duplicates");
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3};
        System.out.println(Arrays.toString(arr));
        duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
