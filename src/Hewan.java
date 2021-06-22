import java.text.SimpleDateFormat;
import java.util.Date;

public class Hewan {

    private int id;
    private String namaHewan;
    private String jenisHewan;
    private String jenisKelamin;
    private String usia;
    private Date tanggalLahir;
    private int banyakKaki;
    private int harga;

    public void membeli(){
        System.out.println("Membeli Hewan");
    }
    public void merawat(){

    }
    public void membersihkan(){

    }
    public void menitipkan(){

    }

    public Hewan() {
    }

    public Hewan(int id, String namaHewan, String jenisHewan, String jenisKelamin) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.id = id;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.jenisKelamin = jenisKelamin;

        System.out.println(id+" "+ namaHewan + " "+ jenisHewan + " "+ jenisKelamin);
    }

    public Hewan(int id, String namaHewan, String jenisHewan, String jenisKelamin,
                 String usia, Date tanggalLahir, int banyakKaki, int harga) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.id = id;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
        this.tanggalLahir = tanggalLahir;
        this.banyakKaki = banyakKaki;
        this.harga = harga;

        System.out.println(id+" "+ namaHewan + " "+ jenisHewan +
                " "+ jenisKelamin + " "+ usia + " "+ tanggalLahir +" "+ banyakKaki + " "+ harga);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getBanyakKaki() {
        return banyakKaki;
    }

    public void setBanyakKaki(int banyakKaki) {
        this.banyakKaki = banyakKaki;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
