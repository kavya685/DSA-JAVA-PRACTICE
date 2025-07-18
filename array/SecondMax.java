class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int i,max=0,max2=0;
        for(i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=max && max2<arr[i])
            {
                max2=arr[i];
            }
        }
        if(max2==0)
        return -1;
        else
        return max2;
    }
}
