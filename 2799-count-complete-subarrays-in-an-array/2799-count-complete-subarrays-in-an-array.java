
class Solution {
    public int countCompleteSubarrays(int[] nums) {

        int n = nums.length;

        int distinct = 0;

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        distinct = set.size();

        int count = 0;
        int left = 0;

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int right = 0; right < n; right++) {

            map.put(nums[right],
                map.getOrDefault(nums[right], 0) + 1);

            while (map.size() == distinct) {

                count += n - right;

                map.put(nums[left],
                    map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }
        }

        return count;
    }
}
