public class FindUnique {
    public int findUnique(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = -1;
                arr[i + 1] = -1;
            } else {
                ans = arr[i];
            }
        }
        return ans;
    }
}
