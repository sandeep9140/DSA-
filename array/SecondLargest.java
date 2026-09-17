public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        System.out.println(secondLargest);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] >secondLargest && arr[i] != largest){
                secondLargest=arr[i];
            

            }

        }
        return  secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15 };// 30
        System.out.println(findSecondLargest(arr));

    }

}
