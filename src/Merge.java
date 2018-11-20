public class Merge
{
    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp)
    {
        if (from < to)
        {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
    public static void merge(int[] arr, int left, int right, int to, int[] temp1)
    {
        System.out.println(left+"--"+right+"--"+to);
        if(arr[right]<arr[to])
        {
            temp1[left]=arr[right];
            temp1[right]=arr[left];
            System.out.println(temp1[left]+"-"+temp1[right]);
            arr[right]=temp1[right];
            arr[left]=temp1[left];
        }

        System.out.println(arr[left]+" "+arr[right]);
    }
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }
}
