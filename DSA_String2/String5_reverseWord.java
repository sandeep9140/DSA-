import java.util.Arrays;

public class String5_reverseWord {
    public static void main(String[] args) {
        String s="i love my india";

        String[] words=s.split(" ");
        
        int start=0;
        int end=words.length-1;
        
        while(start < end){
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(words));

        String newStr=String.join(" ",words);
        System.out.println(newStr);
    }
    
}
