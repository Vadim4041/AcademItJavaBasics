package AdditionalTasks;

public class MatrixDeterminant {
    public static void main(String[] args) {
        double[][] matrix = {
                {3, -3, -5, 8},
                {-3, 2, 4, -6},
                {2, -5, -7, 5},
                {-4, 3, 5, -6}
        };

        System.out.println(getDeterminant(matrix));
    }

    public static double getDeterminant(double[][] matrix) {
        int size = matrix.length;

        if (size == 1) {
            return matrix[0][0];
        }

        if (size == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int result = 0;
        double[][] minor = new double[size - 1][size - 1];

        for (int i = 0; i < size; ++i) {
            int y = 0;
            int x = 0;

            for (int j = 1; j < size; ++j) {
                for (int k = 0; k < size; ++k) {
                    if (i == k) {
                        continue;
                    }

                    minor[y][x] = matrix[j][k];
                    ++x;

                    if (x == size - 1) {
                        x = 0;
                        ++y;
                    }
                }
            }

            result += Math.pow(-1, i) * matrix[0][i] * getDeterminant(minor);
        }

        return result;
    }
}
