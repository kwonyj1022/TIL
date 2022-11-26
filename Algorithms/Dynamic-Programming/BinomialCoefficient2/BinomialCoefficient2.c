int bin2(int n, int k) {
    int i, j;
    int B[N + 1][K + 1] = { 0 };
    for (i = 0; i <= n; i++) {
        int min = (i < k) ? i : k;
        for (j = 0; j <= min; j++) {
            if (j == 0 || j == i)
                B[i][j] = 1;
            else
                B[i][j] = B[i - 1][j - 1] + B[i - 1][j];
        }
    }
    return B[n][k];
}