class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // We can do with hashmap with TC--> O(n)
        // and SC--> O(n)

        // For SC--> O(1)
        
        int c1=0, c2=0;
        int el1= Integer.MIN_VALUE;
        int el2= Integer.MIN_VALUE;

        int n=nums.length;

        for(int i=0;i<n;i++){
            if(c1==0 && nums[i]!=el2){
                el1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=el1){
                el2=nums[i];
                c2=1;
            }

            else if(nums[i]==el1){
                c1++;
            }

            else if(nums[i]==el2){
                c2++;
            }

            else{
                c1--;
                c2--;
            }
        }

        int count1=0;
        int count2=0;
        List<Integer> ll= new ArrayList<>();
        // mannual checking for the element is a majority element or not
        for(int i=0;i<n;i++){
            if(nums[i]==el1){
                count1++;
            }
            if(nums[i]==el2){
                count2++;
            }
        }

        if(count1>(n/3)){
            ll.add(el1);
        }
        if(count2 > (n/3)){
            ll.add(el2);
        }

        return ll;
    }
}