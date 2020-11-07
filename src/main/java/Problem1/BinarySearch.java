package Problem1;

public class BinarySearch {
    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, target, 0, data.length - 1);
    }
    private static int binarySearch(int[] data, int target, int left, int right) {
        int middle = left + (right - left) / 2;
        if (right < left) {
            return -1;
        }
        if (target < data[middle]) {
            return binarySearch(data, target, left, middle - 1);
        }
        if (target > data[middle]) {
            return binarySearch(data, target, middle +1, right);
        }
        if (target == data[middle]) {
            return middle;
        }
        return -1;
    }
}
