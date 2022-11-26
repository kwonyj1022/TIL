* 이항계수 구하는 공식 <br>
nCk = n! / (k!(n-k)!)&nbsp; &nbsp; &nbsp; for &nbsp; 0 <= k <= n <br>
 &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp;  &nbsp; &nbsp; 또는 <br>
nCk = (n-1)C(k-1) + (n-1)C(k) &nbsp; &nbsp; if 0 < k < n <br>
&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; = 1 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if k = 0 or k = n

```
int bin(int n, int k) {
    if (k == 0 || n == k)
        return 1;
    else
        return bin(n-1, k-1) + bin(n-1, k);
}
```
* 시간복잡도 : 재귀호출이기 때문에 효율적이지 않음
* bin(n, k)를 구하기 위해 계산하는 항의 개수는 2 * bin(n, k) - 1
