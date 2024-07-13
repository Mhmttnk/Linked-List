public class LinkedList
{
    Node head=null;
    Node tail=null;

    void BasaEkle(int data) //The method that adds to the top of the list
    {
        Node eleman=new Node(data);

        if(head==null)
        {
            eleman.next=null;
            head=eleman;
            tail=eleman;

            System.out.println("The list was created and the firs element has been added to list:"+eleman.data);
        }
        else
        {
            eleman.next=head;
            head=eleman;

            System.out.println("Added element to the top of the list:"+eleman.data);
        }
    }
    void SonaEkle(int data) //The method that adds to the end of the list
    {
        Node eleman=new Node(data);

        if(head==null)
        {
            eleman.next=null;
            head=eleman;
            tail=eleman;

            System.out.println("The list was created and the first element has been added to list:"+eleman.data);
        }
        else
        {
            eleman.next=null;
            tail.next=eleman;
            tail=eleman;

            System.out.println("Added element to the end of the list:"+eleman.data);
        }
    }
    void BastanSil() //The method that deletes from the top of the list
    {
        if (head == null) //When the list is empty
        {
            System.out.println("The list is empty,there are no elements to delete...");
        }
        else if (head.next == null) //When there is only one element on the list
        {
            head = null;
            tail = null;
            System.out.println("The only element on the list has been deleted");
        }
        else //When there is more than one element in the list
        {
            head = head.next;
            System.out.println("The element at the top of the list has been deleted");
        }

    }
    void SondanSil() //The method that deletes from the end of the list
    {
        if (head == null) //When the list is empty
        {
            System.out.println("The list is empty,there are no elements to delete...");
        }
        else if (head.next == null) //When there is only one element on the list
        {
            head = null;
            tail = null;
            System.out.println("The only element on the list has been deleted");
        }
        else //When there is more than one element in the list
        {
            Node temp=head;
            Node temp2=head;

            while(temp.next!=null)
            {
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            tail=temp2;
            System.out.println("The element at the end of the list has been deleted");
        }
    }
    void Print() //The method that prints
    {
        if(head==null)
        {
            System.out.println("The list is empty...");
        }
        else
        {
            Node temp=head;

            System.out.println("Data in Linear Unidirectional Linked List ");
            while(temp!=null) //Traveling between nodes
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
