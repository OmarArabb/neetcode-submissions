class Solution {
        public int minEatingSpeed(int[] piles, int h) {

        int left = 1 , right = Arrays.stream(piles).max().getAsInt();
        int ans = right;
        while (left <= right){
            int k = (left + right) / 2;
            long hours = 0;
            for (int pile : piles){
                hours += (int) Math.ceil((double) pile / k);
            }
            if (hours <= h){
                ans = Math.min(ans, k);
                right = k - 1;
            }else {
                left = k + 1;
            }
        }
        return ans;

    }
}
