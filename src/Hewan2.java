public class Hewan2 extends Hewan{
    private int jumlahHewan;
    private int banyakBeli, lamaMenitipkan;
    private String jenisMakanan;

    public void biayaMerawat(){

    }
    public void biayaMenitipkan(){

    }

    public int getJumlahHewan() {
        return jumlahHewan;
    }

    public void setJumlahHewan(int jumlahHewan) {
        this.jumlahHewan = jumlahHewan;
    }

    public int getBanyakBeli() {
        return banyakBeli;
    }

    public void setBanyakBeli(int banyakBeli) {
        this.banyakBeli = banyakBeli;
    }

    public int getLamaMenitipkan() {
        return lamaMenitipkan;
    }

    public void setLamaMenitipkan(int lamaMenitipkan) {
        this.lamaMenitipkan = lamaMenitipkan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    @Override
    public void membeli() {
        super.membeli();
    }

    @Override
    public void menitipkan() {
        super.menitipkan();
    }
}
