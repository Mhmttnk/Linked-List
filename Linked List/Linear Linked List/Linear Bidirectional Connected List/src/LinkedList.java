public class LinkedList
{
    Node head=null;
    Node tail=null;

    void BasaEkle(int data) //The method that adds to the top of the list
    {
        Node eleman=new Node(data);

        if(head==null)
        {
            head=eleman;
            tail=eleman;
            System.out.println("The list was created and the firs element has been added to list:"+eleman.data);
        }
        else
        {
            eleman.next=head;
            head.prev=eleman;
            head=eleman;
            System.out.println("The element has been added to the top of the list:"+eleman.data);
        }
    }
    void SonaEkle(int data) //The method that adds to the end of the list
    {
        Node eleman=new Node(data);

        if(head==null)
        {
            head=eleman;
            tail=eleman;
            System.out.println("The list was created and the firs element has been added to list:"+eleman.data);
        }
        else
        {
            tail.next=eleman;
            eleman.prev=tail;
            tail=eleman;
            System.out.println("The element has been added to the end of the list:"+eleman.data);
        }
    }
    void Print() //The method that prints
    {
        Node temp=head;

        System.out.println("Data in Linear Bidirectional Linked List");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
