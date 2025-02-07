class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set=new HashSet<>();
        int n=s.length();
        if(n<3)
        return 0;
        
        int ans=0;
        for(int i=0;i<n-2;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            char c=s.charAt(i+2);
            if(a!=b && b!=c && c!=a){
                ans++;
            }
        }
        return ans;
    }
}