public class LinkedList
{
    Node head=null;
    Node tail=null;

    void Basaekle(int data) //The method that adds the top of the list
    {
        Node eleman=new Node(data);

        if(head==null)
        {
            head=eleman;
            tail=eleman;

            head.next = tail;
            tail.prev = head;
            tail.next=head;
            head.prev=tail;
            System.out.println("The list was created and the first element has been added to list:"+eleman.data);
        }
        else
        {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;

            tail.next=head;
            head.prev=tail;
            System.out.println("The element has been added to the top of the list:"+eleman.data);
        }
    }
    void SonaEkle(int data) //The method that adds the end of the list
    {
        Node eleman=new Node(data);
        if(head==null)
        {
            head=eleman;
            tail=eleman;

            head.next=tail;
            tail.prev=head;
            tail.next=head;
            head.prev=tail;
            System.out.println("The list was created and the first element has been added to list:"+eleman.data);
        }
        else
        {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;

            tail.next=head;
            head.prev=tail;
            System.out.println("The element has been added to the end of the list:"+eleman.data);
        }
    }
    void Print() //The method that prints
    {
        Node temp=head;

        System.out.println("Data in Circular Bidirectional Linked List");
        while(temp!=tail)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(tail.data);
    }
}
