class Solution {
    public int[] twoSum(int[] nums, int target) {
             Map map = new HashMap<Integer, Integer>();

        int i = 0, j = 0;
        int diff;
        for (int k = 0; k < nums.length; k++) {
            diff = target - nums[k];
            if (map.containsKey(diff)) {
                i = k;
                j = (int) map.get(diff);
                break;
            }
            map.put(nums[k], k);

        }

        int[] arr = new int[2];
        arr[0] = Math.min(i, j);
        arr[1] = Math.max(i, j);
        return arr; 
    }
}
