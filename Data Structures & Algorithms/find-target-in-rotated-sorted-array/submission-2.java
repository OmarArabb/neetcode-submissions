class Solution {
        public int search(int[] nums, int target) {

        int l = 0 , r = nums.length - 1 ;
        if (nums[l] < nums[r]){
            int index = Arrays.binarySearch(nums,target);
            return index < 0 ? -1 : index;
        }

        while (l < r){
            int mid = (l + r) / 2;
            if (nums[r] < nums[mid]){
                l = mid + 1;
            }else {
                r = mid;
            }
        }
            int index = Arrays.binarySearch(Arrays.copyOfRange(nums,0,l+1),target);
            if (index >= 0){
            return index;}

            index = Arrays.binarySearch(Arrays.copyOfRange(nums,l,nums.length),target);
            return index < 0 ? -1 : index + l;

    }
}
