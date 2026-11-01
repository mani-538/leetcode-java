class Solution {
    public int missingNumber(int[] nums) {
        int expected = nums.length * (nums.length + 1) / 2;
        int actual = 0;

        for (int number : nums) {
            actual += number;
        }

        return expected - actual;
    }
}