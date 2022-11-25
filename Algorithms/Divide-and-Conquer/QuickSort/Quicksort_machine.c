#include <stdio.h>
#define N 8

void quicksort(int S[], int low, int high);
void partition(int S[], int low, int high, int* pivotpoint);
void InitialValues(int S[]);
void NowS(int S[], int i, int j);
void FinalValues(int S[]);

int main(void) {
    int S[N] = { 15, 22, 13, 27, 12, 10, 20, 25 };
    quicksort(S, 0, N - 1);
    for (int i = 0; i < N; i++) {
        printf("%d ", S[i]);
    }
}

void quicksort(int S[], int low, int high) {
    int pivotpoint;

    if (high > low) {
        partition(S, low, high, &pivotpoint);
        quicksort(S, low, pivotpoint - 1);
        quicksort(S, pivotpoint + 1, high);
    }
}

void partition(int S[], int low, int high, int* pivotpoint) {
    InitialValues(S);

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
        NowS(S, i, j);
    }
    *pivotpoint = j;
    int tmp = S[low];
    S[low] = S[*pivotpoint];
    S[*pivotpoint] = tmp;

    FinalValues(S);
}

void InitialValues(int S[]) {
    printf("\n  i    j   | ");
    for (int i = 0; i < N; i++) {
        printf(" S[%d] ", i);
    }
    printf("\n-----------|-------------------------------------------------------------------------------------------\n");
    printf(" □   □   |");
    for (int i = 0; i < N; i++) {
        printf("%4d  ", S[i]);
    }
    printf("  ← Initial values\n");
}

void NowS(int S[], int i, int j) {
    printf("           |");
    printf("\n%3d  %3d   |", i, j);
    for (int i = 0; i < N; i++) {
        printf("%4d  ", S[i]);
    }
    printf("\n");
}

void FinalValues(int S[]) {
    printf("           |");
    printf("\n □   □   |");
    for (int i = 0; i < N; i++) {
        printf("%4d  ", S[i]);
    }
    printf("  ← Final values\n");
    printf("\n\n======================================================================================================\n");
}