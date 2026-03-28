class LUPrefix {

    public LUPrefix(int n) {
        
    }
    
    public void upload(int video) {
        seen.add(video);
        while(seen.contains(longestPrefix + 1))
            ++longestPrefix;
    }
    
    public int longest() {
        return longestPrefix;
    }

    private Set<Integer> seen = new HashSet<>();
    private int longestPrefix = 0;
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */