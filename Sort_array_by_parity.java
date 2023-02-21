class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // 
        // Brute-force approach

        //     int c=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]%2!=0)
        //     c++;
        // }
        // for(int k=1;k<=c;k++){

        
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]%2!=0){
        //         int temp = nums[i];
        //         nums[i]=nums[i+1];
        //         nums[i+1]=temp;
        // }
        // }
            
        // }
        // return nums;


        // Two pointers approch

        int arr[] = new int[nums.length];
        int l=0;
        int r=nums.length-1;
        int i=0;
        while(l<=r){
            if(nums[i]%2==0){
                arr[l++]=nums[i];
            }
            else{
                arr[r--]= nums[i];
            }
            
            i++;
        }

        return arr;
    }
}
