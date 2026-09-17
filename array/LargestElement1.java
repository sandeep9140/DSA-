public class LargestElement1 {
    public static int findLargest(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];

            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr={-10,-2,-1};
        int x=findLargest(arr);
        System.out.println(x);
        
    }
    
}
