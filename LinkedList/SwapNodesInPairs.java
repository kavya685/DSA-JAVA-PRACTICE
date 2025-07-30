class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode temp = head;

        for(int i=1;temp!=null;i++)
        {
            if(i%2!=0)
            {
                t1.next = temp;
                t1 = t1.next;
            }

            else
            {
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }

        t1.next = null;
        t2.next = null;

        //now merging
        t1 = d1.next;
        t2 = d2.next;
        ListNode d3 = new ListNode(-1);
        ListNode t3 = d3;

        for(int i=1;t2!=null;i++)
        {
            if(i%2!=0)
            {
                t3.next = t2;
                t2 = t2.next;
            }

            else
            {
                t3.next = t1;
                t1 = t1.next;
            }

            t3 = t3.next;
        }

        while(t1!=null)
        {
            t3.next = t1;
            t1 = t1.next;
            t3 = t3.next;
        }

        t3.next = null;
        return d3.next;
    }
}
