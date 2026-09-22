public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr={1,3,5,7,9,11,15};

        int target=7;

        for(int i=0;i<arr.length;i++){
            System.out.println("Checking: "+arr[i]);

            if(arr[i] == target){
                System.out.println("fount at index : "+i);
                break;
            }
        }
    }
    
}
