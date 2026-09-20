/**
 * String2
 */
public class String2 {

    public static void main(String[] args) {
        String s="madam";

        int start=0;
        int end=s.length()-1;

        boolean isPalindrome=true;
        System.out.println("hello");
        while(start < end ){
            if(s.charAt(start) != s.charAt(end)){
                isPalindrome=false;
                break;

            }
            start++;
            end--;
        }
        System.out.println(isPalindrome);
    }
}