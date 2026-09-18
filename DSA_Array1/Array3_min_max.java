public class Array3_min_max {
    public  static  void minAndmax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[0];
            }

        }
        System.out.println("minimun is = "+min);
        System.out.println("maximum is = "+max);
    }


    public static void main(String[] args) {
        int[] arr={10,30,20,32,13,10};
        minAndmax(arr);
    }
    
}
