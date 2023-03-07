class Solution {
    public int findNumbers(int[] nums) {
        // int c1=0;
        // for(int i=0;i<arr.length;i++){
		// 	int c=0;
		// 	while(arr[i]>0){
		// 		int rem = arr[i]%10;
		// 		c++;
		// 		arr[i]=arr[i]/10;
				
		// 	}
		// 	int c2=c;
		// 	if(c2%2==0){
		// 		c1++;
		// 	}
		// 	// return c1;
		// }
        // return c1;

      // OPTIMIZED APPROACH
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((int)((Math.log10(nums[i])) + 1) % 2 == 0) 
                result++;
        }
        return result;
     }
}
