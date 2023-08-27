class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int N = nums.length;
        
        for(int i=0; i<N; i++) {
            ans ^=nums[i];
        }
        return ans;
    }
}