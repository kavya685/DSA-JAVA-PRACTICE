class Solution {
    Node buildTree(int[] inorder, int[] postorder) {
        // code here
        int n = inorder.length;
        return build(0,n-1,postorder,0,n-1,inorder);
    }
    
    Node build(int postlow,int posthigh,int[] postorder,int inlow,int inhigh,int[] inorder)
    {
        if(postlow>posthigh || inlow>inhigh) return null;
        int val = postorder[posthigh];
        Node root = new Node(val);
        
        int found = -1;
        for(int i=0;i<inorder.length;i++)
        {
            if(inorder[i]==val)
            {
                found = i;
                break;
            }
        }
        
        int cnt = found - inlow;
        
        root.right = build(postlow+cnt,posthigh-1,postorder,found+1,inhigh,inorder);
        root.left = build(postlow,postlow+cnt-1,postorder,inlow,found-1,inorder);
        return root;
    }
}
