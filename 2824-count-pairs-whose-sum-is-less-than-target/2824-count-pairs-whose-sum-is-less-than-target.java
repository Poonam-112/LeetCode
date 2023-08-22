class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int N = nums.size();
        Collections.sort(nums);
        int start = 0;
        int end = N - 1;

        while( start < end) {
            int sum = nums.get(start) + nums.get(end);
            if(sum < target) {
                count += end - start;
                start++;
            } else {
                end --;
            }
        } 
        return count;
    }
}