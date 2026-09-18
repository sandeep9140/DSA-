import java.util.Arrays;
import java.util.HashSet;

public class Array2_duplicate2 {
    public static void main(String[] args) {
        int[] arr={10,29,20,10,30};

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("duplicate: "+arr[i]);
            }
            set.add(arr[i]);
        }

        System.out.println(set);
    }
    
}
