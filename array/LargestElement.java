
public class LargestElement {
    public static void main(String[] args) {
        int[] arr={-5, -2, -10, -1};

        int max=arr[0];


        /*   First method  
        ==========================================*/
        /*
        for(int x : arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println("largest number is :-- "+max);
         */

        /*SECOND MEthod 
        =======================================*/
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("largest element is :  "+max);
    }

    
}