public class Runner
{
    public static void main(String[] args)
    {
        int[] arr={1,0,10,2,14,23,81,1};
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Merge.mergeSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
