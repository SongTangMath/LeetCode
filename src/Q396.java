
public class Q396 {
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        int sum = 0, n = A.length;
        for (int temp : A)
            sum += temp;
        int[] F = new int[n];
        for (int k = 0; k < n; k++)
            F[0] += k * A[k];
        for (int i = 1; i < n; i++)
            F[i] = F[i - 1] + sum - n * A[n - i];
        int max = Integer.MIN_VALUE;
        for (int temp : F)
            max = Math.max(max, temp);
        return max;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
