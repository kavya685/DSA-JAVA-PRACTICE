class Solution {
    int preIndex = 0;

    public Node constructTree(int[] pre, int[] post) {
        // Root should be created from pre[0], not post[0]
        return actualBT(pre, post, 0, post.length - 1);
    }
    
    Node actualBT(int[] pre, int[] post, int l, int r) {
        if (preIndex >= pre.length || l > r) return null;
        
        // Current node from preorder
        Node root = new Node(pre[preIndex++]);
        
        // If single element subtree... return it
        if (l == r || preIndex >= pre.length) return root;
        
        // Find next preorder element in postorder
        int partition = l;
        for (int i = l; i <= r; i++) {
            if (post[i] == pre[preIndex]) {
                partition = i;
                break;
            }
        }
        
        // Build left and right subtrees
        root.left = actualBT(pre, post, l, partition);
        root.right = actualBT(pre, post, partition + 1, r - 1);
        
        return root;
    }
}
