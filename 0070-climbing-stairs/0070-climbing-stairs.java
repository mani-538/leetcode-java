class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int previousTwo = 1;
        int previousOne = 2;

        for (int step = 3; step <= n; step++) {
            int current = previousOne + previousTwo;

            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }
}