public class String4_removeSpace {
    public static void main(String[] args) {
        String s="I love you";
        

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
