/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here.
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        
        while(q.size()!=0)
        {
            ArrayList<Integer> a = new ArrayList<>();
            int curSize = q.size();
            
            for(int i=0;i<curSize;i++){
                Node front = q.remove();
                a.add(front.data);
            
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            
            if(leftToRight==false)
            {
                Collections.reverse(a);
                leftToRight=true;
            }
            else leftToRight=false;
            
            arr.addAll(a);
        }
        return arr;
    }
}
