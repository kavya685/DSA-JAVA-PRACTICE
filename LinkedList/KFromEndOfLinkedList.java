/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node f=head;
        Node s=head;
        Node temp=head;
        int size=0;
        
        while(temp!=null)
        {
            size++;
            if(size<k+1) f=f.next;
            temp=temp.next;
        }
        
        if(k>size) return -1;
        
        while(f!=null)
        {
            s=s.next;
            f=f.next;
        }
        
        return s.data;
    }
}
