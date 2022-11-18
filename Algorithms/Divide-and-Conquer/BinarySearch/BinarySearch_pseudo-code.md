```
index location (index low, index high) {
    index mid;

    if (low > high)
        return 0;                           // 찾지 못했음
    else {
        mid = floor((low + igh) / 2);       // 정수 나눗셈 (나머지 버림)
        if (x == S[mid])                    // 찾았음
            return mmid;
        else if (x < S[mid])
            return location(low, mid-1);    // 왼쪽 반 선택
        else
            return location(mid+1, high);   // 오른쪽 반 선택
    }
}
```
* B(n) = 1
* W(n) = floor(lg n) + 1
* O(lg n)