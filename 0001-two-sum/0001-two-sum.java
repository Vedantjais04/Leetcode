class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;

        HashMap <Integer,Integer> map1 = new HashMap<>();
        int []ans = {-1};
        for(int i=0;i<n;i++)
        {
            int find = target-nums[i];
            if(!map1.containsKey(find)){
                map1.put(nums[i],i);
            }
            else{
                ans = new int[]{i,map1.get(find)};
                return ans;
            }
        }
        return ans;
    }
}