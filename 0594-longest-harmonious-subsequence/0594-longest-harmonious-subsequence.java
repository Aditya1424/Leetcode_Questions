class Solution {
    public int findLHS(int[] nums) {
        // O(nlog n)
        // int ans= 0;
        // int j=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     while(nums[i]-nums[j]>1){
        //         j++;
            
        //     }
        //     if(nums[i]-nums[j]==1){
        //         ans= Math.max(ans,i-j+1);
        //     }
        // }
        // return ans;

        Map<Integer, Integer> mp= new HashMap<>();
        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }

        for(int key: mp.keySet()){
            if(mp.containsKey(key+1)){
                ans= Math.max(ans,mp.get(key)+mp.get(key+1));
            }
        }
        return ans;
    }
}