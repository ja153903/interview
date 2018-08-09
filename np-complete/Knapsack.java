/*
 * Given weights and values of n items, put these items in a knapsack of
 * capacity W to get the maximum total value in the knapsack.
 * In other words, given two integers arrays val[0..n-1] and
 * wt[0..n-1] which represents the values and weights associated
 * with the n items respectively. Also given an integer W which 
 * represents knapsack capacity, find out the maximum value
 * subset of val[] such that the sum of the weights of this subset
 * is smaller than or equal to W
 */

public class Knapsack {
    private static int max(int a, int b) { return a > b ? a : b; }

    public static int knapsack(int W, int[] wt, int[] val, int n) {
        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i-1] <= w) {
                    dp[i][w] = max(val[i-1] + dp[i-1][w-wt[i-1]], 
                            dp[i-1][w]);
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

        return dp[n][W];
    }
}
