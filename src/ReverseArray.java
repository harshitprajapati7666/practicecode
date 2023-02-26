public class ReverseArray {
    public int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public void reverseArrayInPlace(int[] arr) {
        int i = 0, j = arr.length;
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j++;
        }
    }

    public void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
