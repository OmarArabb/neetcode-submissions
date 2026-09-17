class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixProduct = new int[length];
        int[] suffixProduct = new int[length];

        prefixProduct[0] = nums[0];
        suffixProduct[length - 1] = nums[length - 1];
        for (int i = 1; i < length; i++) {
            // 1 2 4 6
            // pre : 1 2 8 42
            // suf : 48 48 24 6
            // ans : [48,24,12,8]
            prefixProduct[i] = prefixProduct[i - 1] * nums[i];
            suffixProduct[length - i - 1] = suffixProduct[length - i] * nums[length - i - 1];
        }
        int[] ans = new int[length];
        ans[0] = suffixProduct[1];
        ans[length - 1] = prefixProduct[length - 2];
        for (int i = 1; i < length - 1; i++) {
            ans[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
        }
        return ans;
    }
}  
