* 동적계획식으로 설계하면,, 2차원 배열 B를 만들고, 각 B[i][j]에는 bin(i, j)를 저장하도록 함
* B[ i ][ j ] = B[ i-1 ][ j-1 ] + B[ i-1 ][ j ]  &nbsp; &nbsp; if 0 < j < i <br>
 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; = 1 &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;if j = 0 or j = i
 * B[0][0]부터 시작하여 위에서 아래로 재귀 관계식을 적용하여 배열을 채워나가면 됨

 ```
 int bin2(int n, int k) {
    index i, j;
    int B[0..n][0..k];
    for (i = 0; i <= n; i++) {
        for (j = 0; j <= minimum(i, k); j++) {
            if (j == 0 || j == i)
                B[i][j] = 1;
            else
                B[i][j] = B[i-1][j-1] + B[i-1][j];
        }
    }
    return B[n][k];
 }
 ```
 * 총 수행 횟수는 Θ(nk)
 * 최악의 경우  Θ(n^2) &nbsp; &nbsp; &nbsp; &nbsp; ( ∵ 0 <= k <= n )