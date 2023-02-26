public class RangeQuery {
    public int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public int rangeQuery(int[] arr, int l, int r) {
        int[] prefSum = makePrefixSumArray(arr);
        int ans = prefSum[r] - prefSum[l - 1];
        return ans;
    }
}
