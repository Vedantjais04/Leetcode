class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap <Character,Character> map1 = new HashMap<>();
        HashMap <Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            char j = t.charAt(i);

            if(map1.containsKey(k)){
                if(map1.get(k)!=j) return false;
            }
            else{
                map1.put(k,j);
            }
            
            if(map2.containsKey(j)){
                if(map2.get(j)!=k) return false;
            }
            else{
                map2.put(j,k);
            }
        }
        return true;
    }
}