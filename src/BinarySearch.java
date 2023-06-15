//Made By : Mohamed Ahmed @AAST
public class BinarySearch {
    int binarySearch(int[] array, int left, int right, int x)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x)
                return mid;
            if (array[mid] > x)
                return binarySearch(array, left, mid - 1, x);
            return binarySearch(array, mid + 1, right, x);
        }
        return -1;
    }
}
