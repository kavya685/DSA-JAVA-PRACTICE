/*linked list node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}
*/
class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        Node old = head;
        Node newwHead = new Node(old.data);
        Node neww = newwHead;
        old=old.next;
        
        //step1 : deep copy of old ll
        while(old!=null)
        {
            neww.next = new Node(old.data);
            neww = neww.next;
            old = old.next;
        }
        
        old = head;
        neww = newwHead;
        
        //step2 : merging both ll to assign random to deep copy
        Node m = new Node(-1);
        Node merge = m;
        for(int i=1;neww!=null;i++)
        {
            if(i%2!=0)
            {
                merge.next = old;
                old = old.next;
            }
            
            else
            {
                merge.next = neww;
                neww = neww.next;
            }
            
            merge = merge.next;
        }
        
        //assigning random
       m = m.next;       // m originally points to head
       merge = m;

       while (merge != null) {
            if (merge.random != null) {
            merge.next.random = merge.random.next;
            }
            else {
            merge.next.random = null;
            }

            // move to next original node
            if (merge.next != null)
            merge = merge.next.next;
            else
            break;
        }


        
        //seperating two ll
        Node nodeOld = new Node(-1);
        old = nodeOld;
        Node nodeNew = new Node(-1);
        neww = nodeNew;
        
        for(int i=1;m!=null;i++)
        {
            if(i%2!=0)
            {
                old.next = m;
                old = old.next;
            }
            
            else
            {
                neww.next = m;
                neww = neww.next;
            }
            
            m = m.next;
        }
        old.next = null;
        neww.next = null;

        
        return nodeNew.next;
    }
}
