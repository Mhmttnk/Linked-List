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
        else //When there is one more than one element in the list
        {
            head=head.next;
            tail.next=head;
        }
    }
    void SondanSil() //The method that deletes from the end of the list
    {
        if(head==null) //When there is no element in the list
        {
            System.out.println("The List is empty...");
        }
        else if (head==tail) //When there is only one element in the list
        {
            head=null;
            tail=null;
        }
        else //When there is one more than one element in the list
        {
            Node temp=head;

            while(temp.next!=tail) //The process of finding the previous element from the "tail"
            {
                temp=temp.next;
            }
            tail=temp;
            tail.next=head;
        }
    }
    void Print() //The method that prints
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
