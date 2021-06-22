import java.util.Date;

public class Aksi {
    public static void main(String[] args) {
        Hewan kucing = new Hewan();

        Hewan anjing = new Hewan(123, "Bean", "Chihuahua", "Jantan");

        Hewan kelinci = new Hewan(125, "Rachel",
                "Cashmerelop", "Betina",
                "6 Bulan", new Date(), 4, 500000);
    }
}
