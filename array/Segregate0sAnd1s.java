// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i,n=arr.length,zerocount=-1;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zerocount++;
            }
            arr[i]=0;
        }
        
        for(i=zerocount+1;i<n;i++)
        {
            arr[i]=1;
        }
        
        
    }
}
