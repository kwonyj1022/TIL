typedef struct Edge {
    int from;
    int to;
    int weight;
} Edge;

typedef int set_pointer;

typedef struct nodetype {
    int parent;
    int depth;
}nodetype;

typedef nodetype universe[VERTAX_CNT + 1];

universe U;

void makeset(int i) {
    U[i].parent = i;
    U[i].depth = 0;
}

set_pointer find(int i) {
    int j;
    j = i;
    while (U[j].parent != j) {
        j = U[j].parent;
    }
    return j;
}

void merge(set_pointer p, set_pointer q) {
    if (U[p].depth == U[q].depth) {
        U[p].depth += 1;
        U[q].parent = p;
    }
    else if (U[p].depth < U[q].depth)
        U[p].parent = q;
    else
        U[q].parent = p;
}

bool equal(set_pointer p, set_pointer q) {
    if (p == q)
        return true;
    else
        return false;
}

void initial(int n) {
    for (int i = 1; i <= n; i++) {
        makeset(i);
    }
}

void kruskal(int n, int m, Edge E[EDGE_CNT + 1], Edge F[MST_EDGE_CNT]) {
    int i, j;
    set_pointer p, q;
    Edge e;

    for (int i = 1; i <= m - 1; i++) {
        for (int j = i + 1; j <= m; j++) {
            if (E[i].weight > E[j].weight) {
                Edge tmp = E[i];
                E[i] = E[j];
                E[j] = tmp;
            }
        }
    }
    for (int i = 1; i <= m - 1; i++) {
        for (int j = i + 1; j <= m; j++) {
            if (E[i].weight == E[j].weight) {
                if (E[i].from > E[j].from) {
                    Edge tmp = E[i];
                    E[i] = E[j];
                    E[j] = tmp;
                }
            }
        }
    }
    for (int i = 1; i <= m - 1; i++) {
        for (int j = i + 1; j <= m; j++) {
            if ((E[i].weight == E[j].weight) && (E[i].from == E[j].from)) {
                if (E[i].to > E[j].to) {
                    Edge tmp = E[i];
                    E[i] = E[j];
                    E[j] = tmp;
                }
            }
        }
    }

    initial(n);

    int eIdx = 1;
    int fIdx = 0;
    while ((fIdx < MST_EDGE_CNT) && (eIdx <= EDGE_CNT)) {
        e = E[eIdx];
        i = e.from;
        j = e.to;
        p = find(i);
        q = find(j);
        if (!equal(p, q)) {
            merge(p, q);
            F[fIdx++] = e;
        }
        eIdx++;
    }
}