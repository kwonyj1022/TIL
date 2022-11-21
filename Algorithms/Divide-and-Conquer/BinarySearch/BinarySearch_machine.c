#include <stdio.h>

#define N 10    // 배열 요소의 개수
#define X 3     // 찾으려는 값

int location(int S[N], int x, int low, int high);
void machine(int S[N], int x, int low, int high);

int main(void)
{
    int S[N] = { 0, 1, 2, 3, 6, 9, 10, 11, 14, 20 };    // 배열 초기화

    printf("\n 배열 S = [ ");
    for (int i = 0; i < N; i++) {
        if (i != N - 1) {
            printf("%d, ", S[i]);
        }
        else {
            printf("%d ]\n", S[i]);
        }
    }
    printf("\n 찾으려는 값 x = %d\n", X);
    printf("\n x는 %d번째 인덱스에 있다.\n\n", location(S, X, 0, N));
    printf("--------------------------\n");
    machine(S, X, 0, N);
}

int location(int S[N], int x, int low, int high) {
    int mid;

    if (low > high)
        return -1;
    else {
        mid = (low + high) / 2;
        if (x == S[mid])
            return mid;
        else if (x < S[mid])
            return location(S, x, low, mid - 1);
        else
            return location(S, x, mid + 1, high);
    }
}

void machine(int S[N], int x, int low, int high)
{
    printf(" location(S, X, %d, %d)\n", low, high);

    printf("\t\t low = %d\n", low);
    printf("\t\t high = %d\n", high);

    if (low > high) {
        printf("\t\t low > high");
        return;
    }
    else {
        int mid = (low + high) / 2;
        printf("\t\t mid = %d\n\n", mid);

        if (x == S[mid]) {
            printf("\t\t X = %d = S[mid] = S[%d] = %d\n", x, mid, S[mid]);
            printf("\n 따라서 X는 %d번째 인덱스에 있다.\n", mid);
            return;
        }
        else if (x < S[mid]) {
            printf("\t\t X = %d < S[mid] = S[%d] = %d\n\n\n", x, mid, S[mid]);
            printf("\t location(S, X, low, mid - 1) =");
            return machine(S, x, low, mid - 1);
        }
        else {
            printf("\t\t X = %d > S[mid] = S[%d] = %d\n\n\n", x, mid, S[mid]);
            printf("\t location(S, X, mid + 1, high) =");
            return machine(S, x, mid + 1, high);
        }
    }
}