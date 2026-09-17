//count max element how much time in array
public class CountMax {
    public static void main(String[] args) {
        int arr[] ={5,1,2,5,3,4,5,2};
        int max=arr[0];

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
            {
                count++;
            }
        }
        System.out.println(max +"times="+count);

    }
    
}
