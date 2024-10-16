// Don't delete any comments below!!!
public class MakananBasah {
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)

    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Todo : Create Method ShowData
    public void ShowData() {
        System.out.println("Nama: " + nama + "\nJumlah: " + jumlah + "\nHarga: " + harga + "\nBrand: " + brand);
    }
}
