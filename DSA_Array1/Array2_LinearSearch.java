public class Array2_LinearSearch {

    public static  int linearSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,25,40,15,50};
        int result=linearSearch(arr, 40);
        if(result==-1){
            System.out.println("not found");

        }else{
            System.out.println(" found at index = "+result);
        }

    }
    
}
