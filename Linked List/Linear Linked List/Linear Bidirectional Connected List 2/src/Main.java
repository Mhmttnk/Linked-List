public class Main {
    public static void main(String[] args)
    {
        LinkedList List=new LinkedList();

        List.BasaEkle(4);
        List.BasaEkle(8);
        List.SonaEkle(12);
        List.SonaEkle(16);
        List.SonaEkle(20);

        List.BastanSil();
        List.SondanSil();

        List.Print();
    }
}