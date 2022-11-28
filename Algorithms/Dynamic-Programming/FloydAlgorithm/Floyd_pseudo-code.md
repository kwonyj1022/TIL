```
void floyd(int n, const number W[][], number D[][]) {
    int i, j, k;
    D = W;
    for (k = 1; k <= n; k++)
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                D[i][j] = minimum(D[i][j], D[i][k] + D[k][j]);
}
```
* T(n) = Θ(n^3)
* 최단거리는 구할 수 있지만, 그 경로는 구할 수 없음