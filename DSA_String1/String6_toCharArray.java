import java.util.Arrays;

public class String6_toCharArray {
    public static void main(String[] args) {
        String s="hello";
        char[] arr=s.toCharArray();
        for(char ch : arr){
            System.out.print(ch+" ");
        } 
        
        System.out.println("\n"+Arrays.toString(arr));
    }
    
}
