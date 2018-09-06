package test.save.com;

public class CustomeLinkList {
    Node node;

    static class Node {
        int data;
        Node next;
        public Node(int d) {
           this.data=d;
           next=null;
        }
    }
    
    public void printList()
    {
        Node n = node;
        while (n != null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
    }
    
    public static void main(String[] args) {
        CustomeLinkList llist= new CustomeLinkList();
        llist.node  = new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        llist.node.next = second;
        second.next = third;
        llist.printList();
       /// System.out.println(llist.toString());
    }
}


