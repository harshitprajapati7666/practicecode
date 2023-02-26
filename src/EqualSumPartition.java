public class EqualSumPartition {
    public int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    public boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i : arr) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum)
                return true;
        }
        return false;
    }
}
