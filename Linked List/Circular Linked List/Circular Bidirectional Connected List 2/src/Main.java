public class Main {
    public static void main(String[] args)
    {
        //Adding and Deleting Elements from the Beginning and End of a Circular Bidirectionally Connected List

        LinkedList List=new LinkedList();
        List.BasaEkle(100);
        List.BasaEkle(125);
        List.BasaEkle(150);
        List.SonaEkle(175);
        List.SonaEkle(200);

        List.BastanSil();
        List.BastanSil();
        List.SondanSil();

        List.Print();
    }
}