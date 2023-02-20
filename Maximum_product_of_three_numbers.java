class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        long mul = nums[0]*nums[1]*nums[nums.length-1];
        long mul1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        long res = Math.max(mul,mul1);
        return (int)res;
    }
}
