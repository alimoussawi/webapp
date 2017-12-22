public class MatrixMultiplyNumber {
    public static double[][] subtractmatrix(double[][] A, double x)
    {


        double[][] C = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[i].length; j++)
            {
                C[i][j] = A[i][j] *x;
            }
        }
        return C;
    }
}
