class Solution {
    private boolean isPossible(int diff, int[] nums, int p) {
        int i = 0;
        int n = nums.length;

        while (i < n - 1) {
            if (Math.abs(nums[i] - nums[i + 1]) <= diff) {
                p--;
                if (p == 0) return true;
                i++; // skip the next element as it's paired
            }
            i++;
        }

        return false;
    }

    public int minimizeMax(int[] nums, int p) {
        if (p == 0) return 0;

        Arrays.sort(nums);
        int n = nums.length;
        int l = 0, r = nums[n - 1] - nums[0];
        int minDiff = r;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (isPossible(mid, nums, p)) {
                minDiff = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return minDiff;
    }
}