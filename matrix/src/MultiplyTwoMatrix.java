public class MultiplyTwoMatrix {
    public static double[][] subtractmatrix(double[][] A, double[][] B)
    {
        double[][] C = new double[A.length][A[0].length];
        for (int i=0; i<A.length; ++i)
            for (int j=0; j<A[i].length; ++j)
                for (int k=0; k<A[i].length; ++k)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }
}
