package test.save.com;

public class LinkListAdd {
    Node node;
    
    static class Node{
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
    
    /* This function is in LinkedList class. Inserts a
    new Node at front of the list. This method is 
    defined inside LinkedList class shown above */
 /*public void push(int new_data)
 {
      1 & 2: Allocate the Node &
               Put in the data
     Node new_node = new Node(new_data);
  
      3. Make next of new Node as head 
     new_node.next = head;
  
      4. Move the head to point to new Node 
     head = new_node;
 }*/
    
    public static void main(String[] args) {
        LinkListAdd llist= new LinkListAdd();
        llist.node= new Node(1);
        Node second = new Node(2);
        Node third  = new Node(3);
        llist.node.next = second;
        second.next = third;
        llist.printList();
    }
}
