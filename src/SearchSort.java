//Made By : Mohamed Ahmed @AAST
public class SearchSort {
    static void printarray(int[] array, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] array = { 4, 3, 2, 1, 1, 5 };
        int size = array.length;
        System.out.println("The Un-Sorted array: ");
        printarray(array, size);
        QuickSort.quickSort(array, 0, size - 1);
        System.out.println("The Sorted array: ");
        printarray(array, size);
        BinarySearch ob = new BinarySearch();
        int x = 1;
        int result = ob.binarySearch(array, 0, size - 1, x);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "
                    + result);
    }
}
