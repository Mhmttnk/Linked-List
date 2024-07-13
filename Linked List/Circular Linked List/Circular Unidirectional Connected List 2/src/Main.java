public class Main {
    public static void main(String[] args)
    {
        //Adding and Deleting Elements at the Beginning and End of a Circular Unidirectional Linked List

        LinkedList List=new LinkedList();
        List.BasaEkle(13);
        List.BasaEkle(26);
        List.BasaEkle(39);
        List.SonaEkle(52);
        List.SonaEkle(65);

        List.BastanSil();
        List.SondanSil();

        List.Print();
    }
}