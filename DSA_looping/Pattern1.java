import java.util.Scanner;

class Pattern1 {

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number for N : ");
        int n = sc.nextInt();
        pattern1(n);



    }
}