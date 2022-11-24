#include <stdio.h>
#define N 10    // 정렬할 배열의 크기 (요소 개수)
int MIN;
void mergesort2(int S[], int low, int high);
void merge2(int S[], int low, int mid, int high);
void printU(int n, const int U[]);
void printResult(int n, const int S[]);

int main(void) {
    int S[N] = { 5, 2, 0, 7, 1, 8, 10, 15, 12, 4 };

    for (int i = 0; i < N; i++) {
        if (S[i] < MIN)
            MIN = S[i];
    }

    mergesort2(S, 0, N-1);
    printResult(N, S);
    return 0;
}

void mergesort2(int S[], int low, int high) {
    int mid;
    if (low < high) {
    printf(" low = %d \t\t\t high = %d\n", low, high);
        mid = (low + high) / 2;
        mergesort2(S, low, mid);
        mergesort2(S, mid + 1, high);
        merge2(S, low, mid, high);
    }
}

void merge2(int S[], int low, int mid, int high) {
    int i, j, k;
    i = low; j = mid + 1; k = low;
    int U[N];
    for (int i = 0; i < N; i++) {
        U[i] = MIN - 1;
    }

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
    printf(" low index = %d\t mid index = %d\t high index = %d\n", low, mid, high);
    printU(N, U);
}

void printU(int n, const int U[]) {
    printf("\n\t U = { ");
    for (int i = 0; i < N; i++) {
        if (U[i] < MIN)
            printf("□ ");
        else
            printf("%2d ", U[i]);
    }
    printf("}\n\n\n");
}

void printResult(int n, const int S[]) {
    printf("\n\n\t[최종 정렬 결과]\n");
    printf("\t S = { ");
    for (int i = 0; i < N; i++) {
        printf("%d ", S[i]);
    }
    printf("}\n");
}