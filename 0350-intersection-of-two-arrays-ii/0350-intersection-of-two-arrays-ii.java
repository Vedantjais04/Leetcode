class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (freq.containsKey(nums1[i])) {
                freq.put(nums1[i], freq.get(nums1[i]) + 1);
            } else {
                freq.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {

            if (freq.containsKey(nums2[i]) && freq.get(nums2[i]) > 0) {
                common.add(nums2[i]);

                freq.put(nums2[i], freq.get(nums2[i]) - 1);
            }
        }
        int[] ans = new int[common.size()];

        for (int i = 0; i < common.size(); i++) {
            ans[i] = common.get(i);
        }
        return ans;
    }
}