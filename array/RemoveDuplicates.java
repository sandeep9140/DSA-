public class RemoveDuplicates {

    public  static  int removeDuplicates(int[] arr){

        int i=0;
        for(int j=1;j>arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={10,10,20,30,30,40};
        System.out.println(removeDuplicates(arr));
        
    }
    
}
