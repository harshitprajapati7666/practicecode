import java.util.ArrayList;

public class RecursionArray {
    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public int fibonacciSeries(int n) {
        if (n == 0 || n == 1)
            return n;
        int prev = fibonacciSeries(n - 1);
        int prevPrev = fibonacciSeries(n - 2);
        return prev + prevPrev;
    }

    public int sumOfDigits(int n) {
        if (n >= 0 && n <= 9)
            return n;
        return sumOfDigits(n / 10) + n % 10;
    }

    public int pow(int p, int q) {
        if (q == 0)
            return 1;
        return pow(p, q - 1) * p;
    }

    public int powAlt(int p, int q) {
        if (q == 0)
            return 1;
        int smallPow = powAlt(p, q / 2);
        if (q % 2 == 0)
            return smallPow * smallPow;
        return p * smallPow * smallPow;
    }

    //    Given a number n and value k. Print k multiples of n.
    public void printMultiplesOfNum(int n, int k) {
        if (k == 1) {
            System.out.println(n);
            return;
        }
        printMultiplesOfNum(n, k - 1);
        System.out.println(n * k);
    }

    //    Given a number n. Find sum of natural numbers till n but with alternate signs.
    public int seriesSum(int n) {
        if (n == 0)
            return 0;
        if (n % 2 == 0)
            return seriesSum(n - 1) - n;
        else
            return seriesSum(n - 1) + n;
    }

    //    GCD = HCF
    public int iGreatestCommonDivisor(int x, int y) { // iteration approach
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    /*
    Euclid's Algorithm
    gcd(x, y) = gcd(y, x % y)
    gcd(x, 0) = x
    lcm * gcd = x * y
     */
    public int greatestCommonDivisor(int x, int y) {
        if (y == 0)
            return x;
        return greatestCommonDivisor(y, x % y);
    }

    public void printArrayWithRecursion(int[] array, int index) {
        if (index == array.length)
            return;
        System.out.println(array[index]);
        printArrayWithRecursion(array, index + 1);
    }

    public int maxInArray(int[] array, int index) {
        if (index == array.length - 1)
            return array[index];
        int smallAns = maxInArray(array, index + 1);
        return Math.max(array[index], smallAns);
    }

    public int sumOfArray(int[] array, int index) {
        if (index == array.length)
            return 0;
        int smallAns = sumOfArray(array, index + 1);
        return smallAns + array[index];
    }

    public boolean searchInArray(int[] array, int n, int target, int index) {
        if (index >= n)
            return false;
        if (array[index] == target)
            return true;
        return searchInArray(array, n, target, index + 1);
    }

    public int findIndex(int[] array, int n, int target, int index) {
        if (index >= n)
            return -1;
        if (array[index] == target)
            return index;
        return findIndex(array, n, target, index + 1);
    }

    public void findAllIndices(int[] array, int n, int target, int index) {
        if (index >= n)
            return;
        if (array[index] == target)
            System.out.println(index);
        findAllIndices(array, n, target, index + 1);
    }

    public ArrayList<Integer> allIndices(int[] array, int n, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (index >= n)
            return ans;
        if (array[index] == target)
            ans.add(index);
        ArrayList<Integer> smallAns = allIndices(array, n, target, index + 1);
        ans.addAll(smallAns);
        return ans;
    }
}