public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2},
                {3, 4}
        };

        int n = matrix.length;
        int[] row = new int[n];
        int[] cols = new int[matrix[0].length];

        // Calculate row sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                row[i] += matrix[i][j];
            }
        }

        // Calculate column sums
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < n; j++) {
                cols[i] += matrix[j][i];
            }
        }

        // Find maximum value between row sums and column sums
        int max = Integer.MIN_VALUE;
        int lenR = row.length;
        int lenC = cols.length;
        int i = 0;

        while (i < Math.min(lenR, lenC)) {
            max = Math.max(max, Math.max(row[i], cols[i]));
            i++;
        }

        while (i < lenR) {
            max = Math.max(max, row[i]);
            i++;
        }

        while (i < lenC) {
            max = Math.max(max, cols[i]);
            i++;
        }

        System.out.println("Max value: " + max);

        // Calculate SumOfOp
        int SumOfOp = 0;

        // Calculate the sum of differences
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                SumOfOp += max - matrix[r][c];
            }
        }

        System.out.println("SumOfOp: " + SumOfOp);
    }
}
