/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int sum = 0;
    public int nodeSum(Node root, int l, int r) {
        // code here
      //while preorder traversing add the valid values in sum
        preOrder(root,l,r);
        return sum;
    }
    
    void preOrder(Node root, int l, int r)
    {
        if(root==null) return;
        if(root.data>=l && root.data<=r) sum+=root.data;
        preOrder(root.left,l,r);
        preOrder(root.right,l,r);
    }
}
