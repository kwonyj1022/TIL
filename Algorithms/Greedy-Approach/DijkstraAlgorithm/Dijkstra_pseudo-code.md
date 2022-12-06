```
void dijkstra(int n, const number W[][], set_of_edges& F) {
    index i, vnear;
    edge e;
    index touch[2..n];
    number length[2..n];

    F = Φ;
    
    // For all vertices, initialize v1 to be the last vertex on the current shortest path from v1
    // and initialize length of that path to be the weight on the edge from v1
    for (i = 2; i <= n; i++) {  
        touch[i] = 1;
        length[i] = W[1][i];
    }

    repeat (n - 1 times) {
        min = ∞;
        for (i = 2; i <= n; i++)    // Check each vertex for having shortest path
            if (0 <= length[i] < min) {
                min = length[i];
                vnear = i;
            }
        e = edge from vertex indexted by touch[vnear]
                to vertex index by vnear;
        add e to F;
        for (i = 2; i <= n; i++)
            if (length[vnear] + W[vnear][i] < length[i]) {
                length[i] = length[vnear] + W[vnear][i];
                touch[i] = vnear;   // For each vertex not in Y, update its shortest path.
            }                       // Add vertex indexed by vnear to Y
        length[vnear] = -1;
    }
}
```
* T(n) = Θ(n^2)