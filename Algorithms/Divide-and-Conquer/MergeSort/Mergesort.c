void mergesort(int n, int S[]) {
    if (n > 1) {
        const int h = n / 2;
        const int m = n - h;

        int U[N];
        int V[N];
        for (int i = 0; i < h; i++) {
            U[i] = S[i];
        }
        for (int i = 0; i < m; i++) {
            V[i] = S[h + i];
        }

        mergesort(h, U);
        mergesort(m, V);
        merge(h, m, U, V, S);
    }
}

void merge(int h, int m, const int U[], const int V[], int S[]) {
    int i, j, k;
    i = 0; j = 0; k = 0;

    while (i < h && j < m) {
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
    if (i >= h) {
        for (int x = j; x < m; x++) {
            S[k++] = V[x];
        }
    }
    else {
        for (int x = i; x < h; x++) {
            S[k++] = U[x];
        }
    }
}