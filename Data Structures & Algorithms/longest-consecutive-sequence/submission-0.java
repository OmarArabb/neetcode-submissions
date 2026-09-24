class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>() ;
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int tall = 0;
                while (set.contains(num + tall)){
                    ++tall;
                }
                max = Math.max(max,tall);
            }
        }
        return max;
    }
}
