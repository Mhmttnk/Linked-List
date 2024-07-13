public class LinkedList
{
    Node head=null;
    Node tail=null;
    Node temp=null;

    void BasaEkle(int data) //The method that adds the top of the list
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
            System.out.println("The list was created and the first element has been added to the list:"+eleman.data);
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
            System.out.println("The list was created and the first element has been added to the list:"+eleman.data);
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
    void BastanSil() //The method that deletes from the top of the list
    {
        if(head==null) //When there is no element in the list
        {
            System.out.println("The list is empty...");
        }
        else if(head==tail) //When there is only one element in the list
        {
            head=null;
            tail=null;
        }
        else //When there is more than one element in the list
        {
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }
    }
    void SondanSil() //The method that deletes from the end of the list
    {
        if(head==null) //When there is no element in the list
        {
            System.out.println("List is empty...");
        }
        else if(head==tail) //When there is only one element in the list
        {
            head=null;
            tail=null;
        }
        else //When there is more than one element in the list
        {
            temp=head;
            while(temp.next!=tail)
            {
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
            head.prev=tail;
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
