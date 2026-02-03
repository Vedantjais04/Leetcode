class Solution {
  public int majorityElement(int[] nums) {
    int ans = 0;
    int count = 0;
    for (final int num : nums) {
      if (count == 0)
        ans = num;
      count += num == ans ? 1 : -1;
    }
    return ans;
  }
}