void floyd(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1]) {
	int i, j, k;

	for (i = 1; i <= n; i++)
		for (j = 1; j <= n; j++)
			D[i][j] = W[i][j];

	for (k = 1; k <= n; k++)
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				if (D[i][j] > D[i][k] + D[k][j])
					D[i][j] = D[i][k] + D[k][j];
}