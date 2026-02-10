class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int maxlen=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
            
                while(set.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxlen=Math.max(maxlen,currStreak);
            }
        }
        return maxlen;
    }
}