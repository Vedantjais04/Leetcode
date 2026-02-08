class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //Take for example s="anagram", t="nagaram"
        //Example: s -> ['a','n','a','g','r','a','m']
        //Example: t -> ['n','a','g','a','r','a','m']
        //Arrays after sorting
        //ch1 ->[a,a,a,g,m,n,r]->Sorted Alphabetically
        //ch2 ->[a,a,a,g,m,n,r]->Sorted Alphabetically


        return Arrays.equals(ch1,ch2)==true? true: false;
        //We use Arrays.equals() here  because it checks if the
        // two have the same values inside
    }
}