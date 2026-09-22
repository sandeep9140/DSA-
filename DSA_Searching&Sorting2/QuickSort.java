class QuickSort{
    public static void main(String[] args){
        int[] arr={5,2,8,1,3};
        
        int low=0;
        int high=arr.length-1;

        int pivot=arr[high];

        int i=low-1;
        for(int j=low;j<high;j++){
            //System.out.println("Checking: "+arr[j]);
            if(arr[j] < pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;

        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        System.out.println("piovter index; "+i);
        
    }
}