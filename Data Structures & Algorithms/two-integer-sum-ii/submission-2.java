class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int rightPointer = numbers.length - 1;
        int leftPointer = 0;

        while (true){
            if (numbers[leftPointer] + numbers[rightPointer] == target) {
                return new int[]{++leftPointer , ++rightPointer};
            } else if (numbers[leftPointer] + numbers[rightPointer] > target) {
                --rightPointer;
            }else {
                ++leftPointer;
            }
        }
    }

}
