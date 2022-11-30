void floyd2(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1], int P[N + 1][N + 1])
{
	int i, j, k;

	for (i = 1; i <= n; i++)
		for (j = 1; j <= n; j++)
			P[i][j] = 0;

	for (i = 1; i <= n; i++)
		for (j = 1; j <= n; j++)
			D[i][j] = W[i][j];

	for (k = 1; k <= n; k++)
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				if (D[i][k] + D[k][j] < D[i][j]) {
					P[i][j] = k;
					D[i][j] = D[i][k] + D[k][j];
				}
}

void path(int(*P)[N + 1], int q, int r) {
	if (P[q][r] != 0) {
		path(P, q, P[q][r]);
		printf(" v%d", P[q][r]);
		path(P, P[q][r], r);
	}
}