class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =nums.length;
        int left =0;
        int right = nums.length - 1;
        while(left<=right){
            if(nums[left] %2 == 0){
                left++;
            }
            else{
                int temp = nums[left];
                nums[left]= nums[right];
                nums[right] = temp;
                right--;
            }
            
        }
        Arrays.sort(nums, 0, left);
        Arrays.sort(nums, left , n);
        return nums;
    }
}