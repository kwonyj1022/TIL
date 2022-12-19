#include <stdio.h>
#define VERTAX_CNT 7        // 정점 개수
#define EDGE_CNT 9          // 엣지 개수
#define MST_EDGE_CNT 6      // MST 엣지 개수 = VERTAX_CNT - 1

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
    printf("\t\nU[%d].parent = %d\nU[%d].depth = %d\n", i, U[i].parent, i, U[i].depth);
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
        printf("U[%d].depth == U[%d].depth 이므로 U[%d].depth = %d, U[%d].parent = %d로 바뀜\n", p, q, p, U[p].depth, q, U[q].parent);
    }
    else if (U[p].depth < U[q].depth) {
        U[p].parent = q;
        printf("U[%d].depth < U[%d].depth 이므로 U[%d].parent = %d로 바뀜\n", p, q, p, U[p].parent);
    }
    else {
        U[q].parent = p;
        printf("U[%d].depth > U[%d].depth 이므로 U[%d].parent = %d로 바뀜\n", p, q, q, U[q].parent);
    }

    printf("\n현재 U 배열은\n");
    for (int i = 1; i <= VERTAX_CNT; i++) {
        printf("U[%d].parent = %d\nU[%d].depth = %d\n\n", i, U[i].parent, i, U[i].depth);
    }
}

bool equal(set_pointer p, set_pointer q) {
    if (p == q)
        return true;
    else
        return false;
}

void initial(int n) {
    printf("\ninitial(n) 하면\n");
    for (int i = 1; i <= n; i++) {
        makeset(i);
    }
}

void kruskal(int n, int m, Edge E[EDGE_CNT + 1], Edge F[MST_EDGE_CNT]);

int main(void) {
    Edge E[EDGE_CNT + 1] = { {0, 0, 0},
        { 1, 2, 28 },
        { 1, 6, 10 },
        { 2, 3, 16 },
        { 2, 7, 14 },
        { 3, 4, 12 },
        { 4, 5, 22 },
        { 4, 7, 18 },
        { 5, 6, 25 },
        { 5, 7, 24 } };

    Edge F[MST_EDGE_CNT] = { 0 };
    
    kruskal(VERTAX_CNT, EDGE_CNT, E, F);

    printf("\n\n==========================================================\n");
    printf("\n[최종 집합 F]\n");
    for (int i = 0; i < MST_EDGE_CNT; i++) {
        printf("(%d, %d) %d\n", F[i].from, F[i].to, F[i].weight);
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
    printf("\nedge 정렬하면\n");
    for (int i = 1; i <= EDGE_CNT; i++) {
        printf("(%d, %d) %d\n", E[i].from, E[i].to, E[i].weight);
    }
    printf("\n-----------------------------\n");

    initial(n);

    int eIdx = 1;
    int fIdx = 0;
    while ((fIdx < MST_EDGE_CNT) && (eIdx <= EDGE_CNT)) {
        e = E[eIdx];
        i = e.from;
        j = e.to;
        p = find(i);
        q = find(j);
        printf("\n-----------------------------------------------------------------\n");
        printf("\n%d번째 엣지 (%d, %d) %d\n", eIdx, e.from, e.to, e.weight);
        printf("\np = %d, q = %d\n", p, q);
        if (!equal(p, q)) {
            printf("\np != q 이므로 엣지(%d, %d)는 F에 들어감\tF[%d] = (%d, %d) %d\n", e.from, e.to, fIdx + 1, e.from, e.to, e.weight);
            printf("\nmerge 하면 ");
            merge(p, q);
            F[fIdx++] = e;
            printf("\n[ 현재까지의 집합 F ]\n");
            for (int i = 0; i < fIdx; i++) {
                printf("(%d, %d) %d\n", F[i].from, F[i].to, F[i].weight);
            }
        }
        else {
            printf("\np == q 이므로 엣지(%d, %d) %d 는 F에 못 들어감\n", e.from, e.to, e.weight);
        }
        eIdx++;
    }
}