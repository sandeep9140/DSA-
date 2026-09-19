public class String2_countVowel{
    public static void main(String[] args) {
        String a="programming";
        String s=a.toLowerCase();

        int count=0;

        for(int i=0;i<a.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }

        System.out.println(count);
    }
}