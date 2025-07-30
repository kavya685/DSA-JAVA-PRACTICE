// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node head, int x) {
        // Your code here
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node d3 = new Node(-1);
        Node t3 = d3;
        Node t1 = d1;
        Node t2 = d2;
        
        Node temp = head;
        
        while(temp!=null)
        {
            if(temp.data<x)
            {
                t1.next = temp;
                t1 = t1.next;
            }
            
            else if(temp.data>x)
            {
                t2.next = temp;
                t2 = t2.next;
            }
            
            else
            {
                t3.next = temp;
                t3 = t3.next;
            }
            
            temp = temp.next;
        }
        t1.next = d3.next;
        t3.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}
