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

            System.out.println("The list was created and the firs element has been added to list"+eleman.data);
        }
        else
        {
            eleman.next=null;
            tail.next=eleman;
            tail=eleman;

            System.out.println("Added element to the end of the list:"+eleman.data);
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

            System.out.println("Data in Linear Unidirectional Linked List");
            while(temp!=null) //Traveling between nodes
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

}
