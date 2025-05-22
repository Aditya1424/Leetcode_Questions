class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1;         
        int j = n - 1;         
        int k = m + n - 1;   

        // Merge from the back to avoid overwriting elements in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 still has elements left
        // only j because we are adding in first array
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
};
