#include <stdio.h>
#define N 10    // 정렬할 배열의 크기 (요소 개수)
void merge(int h, int m, const int U[], const int V[], int S[]);
void mergesort(int n, int S[]);
void printResult(int n, int S[]);

int main(void) {
    int S[N] = { 5, 2, 0, 7, 1, 8, 10, 15, 12, 4 };
    mergesort(N, S);
    printResult(N, S);
    return 0;
}

void mergesort(int n, int S[]) {
    if (n > 1) {
        const int h = n / 2;
        const int m = n - h;

        int U[N] = { NULL };
        int V[N] = { NULL };

        printf("\n배열 S : ");
        for (int i = 0; i < N; i++) {
            if (S[i] == NULL)
                break;
            printf("%d ", S[i]);
        }
        printf("에 대한 U, V");
        for (int i = 0; i < h; i++) {
            U[i] = S[i];
        }
        for (int i = 0; i < m; i++) {
            V[i] = S[h + i];
        }

        printf("\nU배열 : ");
        for (int i = 0; i < h; i++) {
            if (U[i] == NULL)
                break;
            printf("%d ", U[i]);
        }
        printf("\nV배열 : ");
        for (int i = 0; i < m; i++) {
            if (V[i] == NULL)
                break;
            printf("%d ", V[i]);
        }
        printf("\n");

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

    printf("\n배열 U = { ");
    for (int i = 0; i < N; i++) {
        if (U[i] == NULL)
            break;
        printf("%d ", U[i]);
    }
    printf("}와 배열 V = { ");
    for (int i = 0; i < N; i++) {
        if (V[i] == NULL)
            break;
        printf("%d ", V[i]);
    }
    printf("}를 merge 하면 \n{ ");
    for (int i = 0; i < N; i++) {
        if (S[i] == NULL)
            break;
        printf("%d ", S[i]);
    }
    printf("}\n\n===============================================================\n");
}

void printResult(int n, int S[]) {
    printf("\n\n\t[최종 정렬 결과]\n\t S = ");
    for (int i = 0; i < N; i++) {
        printf("%d ", S[i]);
    }
    printf("\n\n");
}