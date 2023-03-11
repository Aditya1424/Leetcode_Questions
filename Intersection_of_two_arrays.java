class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> ll = new HashSet<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                   ll.add(nums1[i]);
               }
           }
       }
        int []arr = new int[ll.size()];
        int j = 0;
        for (Integer i : ll) {
            arr[j++] = i;
            
        }
        
        return arr;
    }
}
