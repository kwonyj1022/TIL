```
void mergesort (int n, keytype S[]) {
    if (n > 1) {
        const int h = floor(n/2);
        const int m = n - h

        copy S[1] through S[h] to U[1] through U[h];
        copy S[h+1] through S[n] to V[1] through V[m];
        mergesort(h, U);    // 재귀호출
        mergesort(m, V);    // 재귀호출
        merge(h, m, U, V, S);
    }
}

void merge(int h, int m, const keytype U[], const keytype V[], keytype S[]) {
    index i, j, k;
    i = 1; j = 1; k = 1;
    while (i <= h && j <= m) {
        if (U[i] < V[j]) {
            S[k] = U[i];
            i++;
        }
        else {
            S[k] = V[j];
            j++;
        }
        k++;
    }
    if (i > h)
        copy V[j] through V[m] to S[k] through S[h+m];
    else
        copy U[i] through U[h] to S[k] through S[h+m];
}
```
* W(h+m) = W(h) + W(m) + h + m - 1
* O(n lg n)
* 공간복잡도는 2n 즉 O(n)