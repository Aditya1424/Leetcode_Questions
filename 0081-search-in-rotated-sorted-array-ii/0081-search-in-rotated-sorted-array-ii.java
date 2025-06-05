class Solution {
    public boolean search(int[] nums, int target) {
        int n= nums.length;

        int low= 0;
        int high=n-1;

        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target)return true;

            // for duplicates check
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low=low+1;
                high= high-1;
                continue;
            }

            // left sorted half
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high= mid-1;
                }
                else{
                    low= mid+1;
                }
            }

            // right sorted half
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    
                    low= mid+1;
                }
                else{
                    high= mid-1;
                }
            }
        }
        return false;
    }
}