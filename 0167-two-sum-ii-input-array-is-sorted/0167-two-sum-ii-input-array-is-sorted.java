class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        
        int start = 0;
        int end = size - 1;
        
        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum == target) {
                return new int[] { start + 1, end + 1};
            } else if(sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {0, 0};
        
    }
}