```
void kruskal (int n, int m, set_of_edges E, set_of_edges& F) {
    index i, j;
    set_pointer p, q;
    edge e;
    Sort the m edges in E by weight in nondecreasing order;
    F = Φ;
    initial(n); // Initialize n disjoint subset;
    while(number of edges in F is less than n - 1) {
        e = edge with least weight not yet considered;
        i, j = indices of vertices connected by e;
        p = find(i);
        q = find(j);
        if (!equal(p, q)) {
            merge(p, q);
            add e to F;
        }
    }
}
```