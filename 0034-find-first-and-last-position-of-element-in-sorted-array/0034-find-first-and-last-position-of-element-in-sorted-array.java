class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int lb= lowerBound(nums,target);
        int ub= upperBound(nums,target);
        
        return new int[]{lb,ub};
       
          
    }
    public static int lowerBound(int nums[], int target){
        int n= nums.length;
        int low= 0;
        int high= n-1;
        int ans=-1;


        while(low<= high){
            int mid= low+(high-low)/2;
            if(nums[mid]>=target){
                high= mid-1;
            }
            else{
                low= mid+1;
            }
            if(nums[mid]==target){
                ans= mid;
            }
        }
        return ans;
    }

    public static int upperBound(int nums[], int target){
        int n= nums.length;
        int low= 0;
        int high= n-1;
        int ans=-1;


        while(low<= high){
            int mid= low+(high-low)/2;
            if(nums[mid]<=target){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
            if(nums[mid]==target){
                ans=mid;
            }
        }
        return ans;
    }
}