class Solution {
    public String countAndSay(int n) {
        // code here
        if(n==1) return "1";
        String c=countAndSay(n-1);
        int i=0,j=0;
        String ans="";
        while(j<c.length())
        {
            if(c.charAt(i)==c.charAt(j))
            j++;
            else
            {
                int length=j-i;
                ans=ans+length+c.charAt(i);
                i=j;
            }
        }
        if(j==c.length())
        {
            int length=j-i;
            ans=ans+length+c.charAt(i);
        }
    
        return ans;
    }
}
