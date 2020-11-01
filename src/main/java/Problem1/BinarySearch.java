package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length -1);  // place holder
    }

    private static int binarySearch(int[] data, int target, int left, int right) {
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target < data[middle]) {
                right = middle - 1;
            } else if (target > data[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
