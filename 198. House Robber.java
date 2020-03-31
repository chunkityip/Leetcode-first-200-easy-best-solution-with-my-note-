//198. House Robber



class Solution{
public int rob(int[] nums) {
    int[] map = new int[nums.length + 1];
    Arrays.fill(map, -1);
    return robHelpler(nums, nums.length, map);
}

private int robHelpler(int[] nums, int n, int[] map) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return nums[0];
    }
    if (map[n] != -1) {
        return map[n];
    }
    int res = Math.max(robHelpler(nums, n - 2, map) + nums[n - 1], robHelpler(nums, n - 1, map));
    map[n] = res;
    return res;
}
}
