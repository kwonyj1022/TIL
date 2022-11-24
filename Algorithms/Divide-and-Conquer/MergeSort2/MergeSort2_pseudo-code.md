```
void mergesort2 (index low, index high) {
    index mid;
    if (low < high) {
        mid = (low + high) / 2;
        mergesort2(low, mid);
        mergesort2(mid+1, high);
        merge2(low, mid, high);
    }
}

void merge2(index low, index mid, index high) {
    index i, j, k;
    keytype U[low..high];   // 합병하는 데 필요한 지역 배열
    i = low; j = mid+1; k = low;
    while(i <= mid && j <= high) {
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
    if (i > mid)
        move S[j] through S[high] to U[k] through U[high];
    else
        move S[i] through S[mid] to U[k] through U[high];
    move U[low] through U[high] to S[low] through S[high];
}
```
* 공간복잡도가 n (기존 mergesort는 공간복잡도가 2n 이었음)