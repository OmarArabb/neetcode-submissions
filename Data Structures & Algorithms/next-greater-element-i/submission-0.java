class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> ind = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            ind.put(nums1[i], i);
        }
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1);
        Stack<Integer> stack = new Stack<>();

        for (int curr : nums2) {
            while (!stack.isEmpty() && curr > stack.peek()) {
                int val = stack.pop();
                int index = ind.get(val);
                ans[index] = curr;
            }
            if (ind.containsKey(curr)) {
                stack.push(curr);
            }

        }

        return ans;

    }
}