import java.util.HashSet;

public class Array3_duplicate {
    public static boolean duplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;
        for (int x : arr) {
            if (set.contains(x)) {
                duplicate = true;
                break;
            }
            set.add(x);
        }
        return duplicate;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 203, 30, 40, 50 };
        boolean res=duplicate(arr);
        if(res==true){
            System.out.println("duplicate");
        }else{
            System.out.println("unique");
        }

    }

}
