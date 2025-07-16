class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
        int low=0,high=arr.length-1,mid,index=-1;
        
        while(low<=high)
        {
            mid=low+(high-low)/2;
            
            if(arr[mid]>x) high=mid-1;
            
            else //this will work even for when arr[mid]==x
            //you cannot directly return then coz u also 
            //have to see its occurances
            {
                index=mid;
                low=mid+1;
            }
        }
        
        return index;
    }
}
