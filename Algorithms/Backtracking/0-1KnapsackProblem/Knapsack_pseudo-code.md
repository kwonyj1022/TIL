```
void knapsack(index i, int profit, int weight) {
    if ((weight <= W) && (profit > maxprofit)) {
        maxprofit = profit;
        numbest = i;
        bestset = include;
    }
    if (promising(i)) {
        include[i+1] = "yes";
        knapsack(i+1, profit + p[i+1], weight + w[i+1]);
        include[i+1] = "no";
        knapsack(i+1, profit, weight);
    }
}
bool promising (index i) {
    index j, k;
    int totweight;
    float bound;

    if (weight >= W)
        return false;
    else {
        j = i + 1;
        bound = profit;
        totweight = weight;
        while ((j <= n) && (totweight + w[j] <= W)) {
            totweight = totweight + w[j];
            bound = bound + p[j];
            j++;
        }
        k = j;
        if (k <= n)
            bound = bound + (W - totweight) * (p[k] / w[k]);
        
        return bound > maxprofit;
    }
}
```