#include <stdio.h>

#define N 5 // 정점 개수

void floyd2(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1], int P[N + 1][N + 1]);
void path(int P[N + 1][N + 1], int q, int r);

int main(void)
{
	int W[N + 1][N + 1] = { {0,0,0,0,0,0},
		{0,0,1,999,1,5},
		{0,9,0,3,2,999},
		{0,999,999,0,4,999},
		{0,999,999,2,0,3},
		{0,3,999,999,999,0}
	};

	int D[N + 1][N + 1];
	int P[N + 1][N + 1];

	floyd2(N, W, D, P);

	printf(" D 배열 \n");
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			printf("%5d", D[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");

	printf(" P 배열 \n");
	for (int i = 1; i <= N; i++)
	{
		for (int j = 1; j <= N; j++)
		{
			printf("%5d", P[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");

	int from = 5, to = 3;
	printf(" v%d 에서 v%d까지의 경로 : ", from, to);
	printf(" v%d", from);
	path(P, from, to);
	printf(" v%d\n",to);

	return 0;
}

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


void path(int P[N + 1][N + 1], int q, int r) {
	if (P[q][r] != 0) {
		path(P, q, P[q][r]);
		printf(" v%d", P[q][r]);
		path(P, P[q][r], r);
	}
}