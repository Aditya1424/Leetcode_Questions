class Solution {
        public int[] twoSum(int[] nums, int target) {
                Map<Integer, Integer> map= new HashMap<>();
                        int arr[]= new int[2];

                                for(int i=0;i<nums.length;i++){
                                            int rem= target-nums[i];

                                                        if(map.containsKey(rem)){
                                                                        arr[0]= map.get(rem);
                                                                                        arr[1]=i;
                                                                                                    }

                                                                                                                map.put(nums[i],i);
                                                                                                                        }

                                                                                                                                return arr;
                                                                                                                                    }
                                                                                                                                    }