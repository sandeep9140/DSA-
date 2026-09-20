class String1{
    public static void main(String[] args) {
        String s="hello";

        /*
        METHOD 1
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);

     */

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}