public class CheckArraySorted {

    public  static  boolean isSorted(int[] arr){
        boolean result=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                result=false;
            }

        }




        return result;

    }
    public static void main(String[] args) {
        int[] arr={1, 3, 2, 4, 5};
        boolean result=isSorted(arr);
        if(result==true){
            System.out.println("sorted");
        }else{
            System.out.println("unsorted");
        }
        
    }
    
}
