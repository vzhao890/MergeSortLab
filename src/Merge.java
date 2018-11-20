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
        if(arr[right]<arr[left])
        {
            temp1[left]=arr[right];
            temp1[right]=arr[left];
            arr[right]=temp1[right];
            arr[left]=temp1[left];
        }

    }
    public static void mergeSort(int[] elements)
    {
        int n = elements.length;
        int[] temp = new int[n];
        mergeSortHelper(elements, 0, n-1, temp);
    }
}
