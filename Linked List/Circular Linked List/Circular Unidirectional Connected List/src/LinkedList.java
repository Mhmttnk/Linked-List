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
            tail.next=head;
            System.out.println("The list was created and the first element has been added to the list:"+eleman.data);
        }
        else
        {
            eleman.next=head;
            head=eleman;
            tail.next=head;
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
            tail.next=head;
            System.out.println("The list was created and the first element has been added to the list:"+eleman.data);
        }
        else
        {
            tail.next=eleman;
            tail=eleman;
            tail.next=head;
            System.out.println("The element has been added to the end of the list:"+eleman.data);
        }
    }
    void Print() //The methods that prints
    {
        Node temp=head;

        System.out.println("Data in Circular Unidirectional Linked List");
        while(temp!=tail)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(tail.data);

    }
}
