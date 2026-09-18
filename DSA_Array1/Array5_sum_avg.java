public class Array5_sum_avg {
    public static void main(String[] args) {
        int[] arr={10,30,20,10,30};
        int sum=0;
        for(int x: arr){
            sum+=x;
        }
        System.out.println("sum ="+sum);

        double avg=(double)sum/arr.length;

        System.out.println("average ="+avg);
    }
    
}
