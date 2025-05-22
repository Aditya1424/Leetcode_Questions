class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ll= new ArrayList<>();
        int n= nums.length;

        Arrays.sort(nums);

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                int k=j+1;
                int l=n-1;

                while(k<l){

                    long sum= (long)nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum<target){
                        k++;
                    }

                    else if(sum>target){
                        l--;
                    }

                    else{
                        
                        ll.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        // skipping the duplicates
                        while(k<l && nums[k]==nums[k-1])k++;
                        while(k<l && nums[l]==nums[l+1])l--;
                    }
                }
            }
        }
        return ll;
    }
}