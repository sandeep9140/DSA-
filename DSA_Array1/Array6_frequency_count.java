public class Array6_frequency_count {
    public static void main(String[] args) {
        int[] arr={10,30,40,39,19,10,101,10};
        int target=10;
        int count=0;
        for(int x : arr){
            if(x==target){
                count++;

            }
        }
        System.out.println("target = "+count+" times");
    }
    
}
