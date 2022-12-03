typedef struct Edge {
    int from;
    int to;
} Edge;

void dijkstra(int n, const int W[N + 1][N + 1], Edge F[N - 1])
{
    int i, vnear;
    Edge e;
    int touch[N + 1] = { 0 };
    int length[N + 1] = { 0 };

    for (i = 2; i <= n; i++) {
        touch[i] = 1;
        length[i] = W[1][i];
    }
    for (int t = 0; t < n - 1; t++) {
        int min = 999;
        for (i = 2; i <= n; i++) {
            if ((0 <= length[i]) && (length[i] <= min)) {
                min = length[i];
                vnear = i;
            }
        }

        e.from = touch[vnear];
        e.to = vnear;
        F[t] = e;

        for (i = 2; i <= n; i++) {
            if (length[vnear] + W[vnear][i] < length[i]) {
                length[i] = length[vnear] + W[vnear][i];
                touch[i] = vnear;
            }
        }
        length[vnear] = -1;
    }
}

