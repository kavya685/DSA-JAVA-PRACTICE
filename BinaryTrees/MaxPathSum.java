/*what if a path has negative 
numbers but that path gives the max sum....
doing math.max(0,other node) then here it will give u zero 
when it finds its first negative but it will not b like that... 
even though it founds negative no it will first explore the whole 
lst and then rst(even if in that -ve is found) but at the final stage 
of deciding math.max(0,other node) it will ignore if the child gives -ve coz 
node is pos and adding -ve into it will dec its own val so it 
chooses better option which is 0.
*/
class Solution {
    int maxSum = Integer.MIN_VALUE;
    int findMaxSum(Node root) {
        // code here
        find(root);
        return maxSum;
    }
    
    int find(Node root)
    {
        if(root==null) return 0;
        
        //finding left and right...also handling -ve with 0
        int left = Math.max(0,find(root.left));
        int right = Math.max(0,find(root.right));
        
        //updating maxsum
        /*means it works withh -ve also 
        coz v r actually filtering at the stage 
        while finding left and right n ignoring 
        -ve n replacing it with 0*/
        maxSum = Math.max(maxSum,root.data+left+right);
        
        return root.data+Math.max(left,right);
    }
}
