class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
    }
}
