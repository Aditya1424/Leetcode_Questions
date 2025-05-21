class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Optimal approach
        // TC--> O(N*logN)+ O(N*N)
        // SC--> O(1)

        List<List<Integer>> ll= new ArrayList<>();
        int n= nums.length;
        // sort the array
        Arrays.sort(nums);

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j= i+1;
            int k=n-1;

            while(j<k){

                int sum= nums[i]+nums[j]+nums[k];

                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }

                else{
                    List<Integer> l = Arrays.asList(nums[i],nums[j],nums[k]);
                    ll.add(l);
                    j++;
                    k--;
                    // while loop is for checking for not having the same
                    // element again i.e for skipping the duplicates
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]== nums[k+1])k--;
                }
            }
        }
        return ll;
    }
}