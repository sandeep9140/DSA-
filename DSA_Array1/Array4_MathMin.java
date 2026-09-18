public class Array4_MathMin {

    public static void main(String[] args) {
        int[] arr={10,30,20,40,60};
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }

        System.out.println(min);
        System.out.println(max);
        
    }
    
}
