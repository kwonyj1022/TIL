# Simple Matrix Multiplication Algorithm
```
void matrixmult(int n, const number A[][], const number B[][], number& C[][]) {
    index i, j, k;
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            C[i][j] = 0;
            for (k = 1; i <= n; i++) {
                C[i][j] = C[i][j] + A[i][k] * B[k][j];
            }
        }
    }
}
```
* Every-case 임
* T(n) = Θ(n^3)

# Strassen's Matrix Multiplication Algorithm
* 두 n x n 행렬 A와 B의 곱 C 를 계산할 때, A와 B 각 행렬을 4개의 부분행렬(submatrix)로 나눠서 계산
* C = { { C11, C12 }, { C21, C22 } }
* A = { { A11, A12 }, { A21, A22 } }
* B = { { B11, B12 }, { B21, B22 } }

C = {　{ (M1 + M4 - M5 + M7), (M3 + M5) } <br>
　　　{ (M2 + M4), (M1 + M3 - M2 + M6) }　} <br> <br>

M1 = (A11 + A22) * (B11 + B22) <br>
M2 = (A21 + A22) * B11 <br>
M3 = A11 * (B12 - B22) <br>
M4 = A22 * (B21 - B11) <br>
M5 = (A11 + A12) * B22 <br>
M6 = (A21 - A11) * (B11 + B12) <br>
M7 = (A12 - A22) * (B21 + B22) <br>

```
void strassen(int n, n*n matrix A, n*n matrix B, n*n matrix& C) {
    if (n <= threshold)
        compute C = A * B using the standard algorithm;
    else {
        partition A into 4 submatrices A11, A12, A21, A22;
        partition B into 4 submatrices B11, B12, B21, B22;
        compute C = A * B using Strassen's method;
        // example recursive call: strassen(n/2, A11 + A22, B11 + B22, M1)
    }
}
```
* Every-case 임
* T(n) = Θ(n^2.81)