import java.util.Arrays;
import java.util.HashSet;

/**
 * String3
 */
public class String3 {

    public static void main(String[] args) {
        String s="bananabanana";
        
        HashSet<Character> set=new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);

        }
        System.out.println(set);

        for(char ch : set){
            //System.out.println(ch);
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==ch){
                    count++;
                }
            }

            System.out.println(ch+" "+count+" times");
            count=0;
        }
        

    }
}