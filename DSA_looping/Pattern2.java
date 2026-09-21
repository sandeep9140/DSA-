import java.util.Scanner;

public class Pattern2 {
    /*
     * * * * *
     * * * *
     * * *
     * *
     * 
     */

    static  void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");


            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("ENter :- ");
        int n = new java.util.Scanner(System.in).nextInt();

        pattern2(n);

    }

}
