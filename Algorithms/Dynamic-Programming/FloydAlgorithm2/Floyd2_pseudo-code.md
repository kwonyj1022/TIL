* 최단거리와 그 경로 모두 구할 수 있음
```
void floyd2(int n, const number W[][], numer D[][], index P[][]) {
    index i, j, k;
    for (i = 1; i <= n; i++)
        for (j = 1; j <= n; j++)
            P[i][j] = 0;

    D = W;

    for (k = 1; k <= n; k++)
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                if (D[i][k] + D[k][j] < D[i][j]) {
                    P[i][j] = k;
                    D[i][j] = D[i][k] + D[k][j];
                }
}
```

<br>

* 최단 경로 출력하는 코드
```
void path(index q, r) {
    if (P[q][r] != 0) {
        path(q, P[q][r]);
        printf(" v%d", P[q][r]);
        path(P[q][r], r);
    }
}
```