class Solution {
       public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int curr = temperatures[i];
            while (!stack.isEmpty() && curr > stack.peek()[0]){
                int[] val = stack.pop();
                ans[val[1]] = i - val[1]; 
            }
            stack.push(new int[]{curr, i});
        }
        return ans;
    }
}
