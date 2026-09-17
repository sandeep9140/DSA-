public class MissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        
    
        for(int i=1;i<=arr.length;i++){
            if(arr[i-1] != i){
                System.out.println("missing number is:= "+i);
            }
            
        }
    }
    
}
