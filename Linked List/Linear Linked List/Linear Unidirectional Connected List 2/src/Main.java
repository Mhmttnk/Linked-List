public class Main {
    public static void main(String[] args)
    {
        //Element Deletion Operations from the Beginning and End of a Linear Unidirectional Linked List

        LinkedList List=new LinkedList();
        List.BasaEkle(12);
        List.BasaEkle(16);
        List.BasaEkle(20);
        List.SonaEkle(24);
        List.SonaEkle(28);

        List.BastanSil();
        List.SondanSil();

        List.Print();
    }
}