package AdditionalTasks;

public class MatrixDeterminant {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, -3, -5, 8},
                {-3, 2, 4, -6},
                {2, -5, -7, 5},
                {-4, 3, 5, -6}
        };

        System.out.println(getDeterminant(matrix));
    }

    public static int getDeterminant(int[][] matrix) {
        int length = matrix.length;

        if (length == 1) {
            return matrix[0][0];
        }

        int result = 0;
        int[][] minor = new int[length - 1][length - 1];

        for (int i = 0; i < length; ++i) {
            int x = 0;
            int y = 0;

            for (int j = 1; j < length; ++j) {
                for (int k = 0; k < length; ++k) {
                    if (i == k) {
                        continue;
                    }

                    minor[x][y] = matrix[j][k];
                    ++y;

                    if (y == length - 1) {
                        y = 0;
                        ++x;
                    }
                }
            }

            result += Math.pow(-1, i) * matrix[0][i] * getDeterminant(minor);
        }

        return result;
    }
}
