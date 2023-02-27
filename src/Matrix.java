public class Matrix {
    public int[][] add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input - Addition not possible");
            return new int[0][];
        }
        int[][] sum = new int[r1][];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public int[][] multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication not possible - wrong dimension");
            return new int[0][];
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        return mul;
    }

    public int[][] findtranspose(int[][] matrix, int r, int c) {
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public void findTransposeInPlace(int[][] matrix, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void rotateSquareMatrixBy90(int[][] matrix, int n) {
        findTransposeInPlace(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }

    private void reverseArray(int[] array) {
        int i = 0, j = array.length;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public int[][] pascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.println(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.println(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j <= leftCol && totalElements < r * c; j++) {
                System.out.println(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            for (int i = bottomRow; i <= topRow && totalElements < r * c; i++) {
                System.out.println(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int current = 1;
        while (current < n * n) {
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                matrix[topRow][j] = current++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightCol] = current++;
            }
            rightCol--;
            for (int j = rightCol; j <= leftCol && current <= n * n; j++) {
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;
            for (int i = bottomRow; i <= topRow && current <= n * n; i++) {
                matrix[i][leftCol] = current++;
            }
            leftCol++;
        }
        return matrix;
    }

    public int findRectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int findRectangleSumWithSinglePrefixSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0)
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }

    private void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length, c = 0;
        if (r > 0) {
            c = matrix[0].length;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    public int findRectangleSumWithBothPrefixSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findBothPrefixSumMatrix(matrix);
        sum = matrix[l2][r2];
        if (r1 > 0)
            left = matrix[l2][r1 - 1];
        if (l1 > 0)
            up = matrix[l1 - 1][r2];
        if (l1 > 0 && r1 > 0)
            leftUp = matrix[l1 - 1][r1 - 1];
        ans = sum - up - left + leftUp;
        return ans;
    }

    private void findBothPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length, c = 0;
        if (r > 0) {
            c = matrix[0].length;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }
}
