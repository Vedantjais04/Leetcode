class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        int sum= n*(n+1)/2;

        for(int i=0;i<n;i++)
        {
            count=count+nums[i];
        }
        sum=sum-count;

        return sum;
    }
}