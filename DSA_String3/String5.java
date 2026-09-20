public class String5 {
    public static void main(String[] args) {
        String s1 = "listenq";
        String s2 = "silent";

        boolean isAnagram = true;

        if (s1.length() != s2.length()) {
            isAnagram = false;
            

        }
        else{
             for (int i = 0; i < s1.length(); i++) {
            int count =0;
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)==s2.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                isAnagram=true;
                
            }
        }

        }

       
        if(isAnagram==true){
            System.out.println("its a anagram");
        }
    }

}
