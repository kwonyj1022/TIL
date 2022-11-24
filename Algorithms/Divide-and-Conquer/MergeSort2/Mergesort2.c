void mergesort2(int S[], int low, int high) {
    int mid;
    if (low < high) {
        mid = (low + high) / 2;
        mergesort2(S, low, mid);
        mergesort2(S, mid + 1, high);
        merge2(S, low, mid, high);
    }
}

void merge2(int S[], int low, int mid, int high) {
    int i, j, k;
    int U[N] = { NULL };   // 합병하는 데 필요한 지역 배열
    i = low; j = mid + 1; k = low;
    while (i <= mid && j <= high) {
        if (S[i] < S[j]) {
            U[k] = S[i];
            i++;
        }
        else {
            U[k] = S[j];
            j++;
        }
        k++;
    }
    if (i > mid) {
        for (int x = j; x <= high; x++) {
            U[k++] = S[x];
        }
    }
    else {
        for (int x = i; x <= mid; x++) {
            U[k++] = S[x];
        }
    }
    for (int x = low; x <= high; x++) {
        S[x] = U[x];
    }
}