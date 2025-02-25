class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long prefixSum = 0;
        for(int i : arr){
            prefixSum += i;
            oddCount += prefixSum % 2;
        }
        oddCount += (arr.length - oddCount) * oddCount;
        return (int)(oddCount % 1000000007);
    }
}