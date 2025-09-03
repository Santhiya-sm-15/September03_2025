class Solution {
    public Node reverse(Node head) {
        Node newhead=null;
        for(Node i=head;i!=null;)
        {
            Node nxt=i.next;
            i.next=newhead;
            if(newhead==null)
                newhead=i;
            else
            {
                newhead.prev=i;
                newhead=newhead.prev;
            }
            i=nxt;
        }
        return newhead;
    }
}