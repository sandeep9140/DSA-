import java.util.Arrays;
public class Array1_basics {
    public static void main(String[] args) {
        int arr[]={10,20,30,15};
        int arr1[]={10,20,30,15};
        System.out.println(arr.length);
        
        System.out.println("compare two arrays:-----");
        System.out.println(Arrays.equals(arr1, arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int x :arr){
            System.out.print(x+" ");
        }

        System.out.println("sorted array: -");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



        System.out.println("copy arrays:_____");
        int[] newArr=Arrays.copyOf(arr1, 2);
        System.out.println(Arrays.toString(newArr));

        int[] rangeCopyArray=Arrays.copyOfRange(arr1, 1, 3);
        System.out.println(Arrays.toString(rangeCopyArray));


        //binary search 
        System.out.println("binary search :----");
        int index=Arrays.binarySearch(arr, 30);
        System.out.println(index);
    }

    
}