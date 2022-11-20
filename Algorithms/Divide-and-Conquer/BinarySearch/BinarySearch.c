int location(int S[], int x, int low, int high)
{
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