#include <stdio.h>
#define N 5
void machine(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1], int from, int to);
void printProcess(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1]);
void printD(int D[N + 1][N + 1]);
void printMinDistance(int D[N + 1][N + 1], int from, int to);

int main(void) {
	int W[N + 1][N + 1] = { {0,0,0,0,0,0},
							{0,0,1,999,1,5},
							{0,9,0,3,2,999},
							{0,999,999,0,4,999},
							{0,999,999,2,0,3},
							{0,3,999,999,999,0}
	};
	int from = 1;
	int to = N;

	int D[N + 1][N + 1] = { 0 };

	machine(N, W, D, from, to);

	return 0;
}

void machine(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1], int from, int to) {
	printProcess(n, W, D);
	printD(D);
	printMinDistance(D, from, to);
}

void printProcess(int n, const int W[N + 1][N + 1], int D[N + 1][N + 1]) {
	int i, j, k;

	for (i = 1; i <= n; i++)
		for (j = 1; j <= n; j++)
			D[i][j] = W[i][j];

	for (k = 1; k <= n; k++) {
		printf("\n k = %d\n\n", k);
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				printf("\tD[%d][%d]    =    min(D[%d][%d], D[%d][%d] + D[%d][%d])", i, j, i, j, i, k, k, j);
				printf("    =    min( %3d , %3d + %-3d )    =    ", D[i][j], D[i][k], D[k][j]);
				int min = D[i][j];
				if (D[i][j] > D[i][k] + D[k][j])
					min = D[i][k] + D[k][j];
				D[i][j] = min;
				printf("%d\n\n", D[i][j]);
			}
			printf("\t-------------------------------------------------------------------------------------------------\n\n");
		}
	}
}

void printD(int D[N + 1][N + 1]) {
	printf(" D 배열 \n");
	printf("      | ");
	for (int i = 1; i <= N; i++) {
		printf("%4d  ", i);
	}
	printf("\n------|-----------------------------------------\n");
	for (int i = 1; i <= N; i++)
	{
		printf("%4d  | ", i);
		for (int j = 1; j <= N; j++)
		{
			printf("%4d  ", D[i][j]);
		}
		printf("\n");
		printf("      |\n");
	}
	printf("\n\n");
}

void printMinDistance(int D[N + 1][N + 1], int from, int to) {
	printf("\tv%d에서 v%d까지의 최단거리 : %d\n", from, to, D[from][to]);
}