void quicksort(int S[], int low, int high) {
    int pivotpoint;

    if (high > low) {
        partition(S, low, high, &pivotpoint);
        quicksort(S, low, pivotpoint - 1);
        quicksort(S, pivotpoint + 1, high);
    }
}

void partition(int S[], int low, int high, int* pivotpoint) {
    int i, j;
    int pivotitem;

    pivotitem = S[low];
    j = low;
    for (i = low + 1; i <= high; i++) {
        if (S[i] < pivotitem) {
            j++;
            int tmp = S[i];
            S[i] = S[j];
            S[j] = tmp;
        }
    }
    *pivotpoint = j;
    int tmp = S[low];
    S[low] = S[*pivotpoint];
    S[*pivotpoint] = tmp;
}