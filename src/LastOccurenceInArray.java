public class LastOccurenceInArray {
    public int lastOccurence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public int lastOccurenceOptimized(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
}
