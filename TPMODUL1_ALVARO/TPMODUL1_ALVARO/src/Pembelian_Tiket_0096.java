import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian_Tiket_0096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Penerbangan> Daftarpenerbangan = new ArrayList<>();
        ArrayList<Penumpang> DaftarPenumpang_0096 = new ArrayList<>();
        
        // Menambahkan beberapa penerbangan ke daftar
        Daftarpenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        Daftarpenerbangan.add(new Penerbangan("GA002", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
        
        boolean running = true;
        while (running) {
            // Menampilkan menu utama
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (menu) {
                case 1:
                    // Tampilkan daftar penerbangan
                    System.out.println("Daftar Penerbangan:");
                    for (int i = 0; i < Daftarpenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". ");
                        Daftarpenerbangan.get(i).tampilDaftarpenerbangan();
                    }
                    break;
                case 2:
                    // Beli tiket
                    if (Daftarpenerbangan.size() == 0) {
                        System.out.println("Penerbangan Tidak Tersedia.");
                    } else {
                        System.out.println("Masukkan data penumpang");
                        System.out.print("Masukkan NIK: ");
                        String NIK_0096 = scanner.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String NamaDepan_0096 = scanner.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String NamaBelakang_0096 = scanner.nextLine();

                        System.out.println("Pilih penerbangan yang tersedia:");
                        for (int i = 0; i < Daftarpenerbangan.size(); i++) {
                            System.out.println((i + 1) + ". ");
                            Daftarpenerbangan.get(i).tampilDaftarpenerbangan();
                        }
                        
                        System.out.print("Pilih nomor penerbangan (1/2): ");
                        int pilihan = scanner.nextInt();
                        
                        if (pilihan >= 1 && pilihan <= Daftarpenerbangan.size()) {
                            Penerbangan PenerbanganDipilih_0096 = Daftarpenerbangan.get(pilihan - 1);
                            Penumpang penumpang = new Penumpang(NIK_0096, NamaDepan_0096, NamaBelakang_0096, PenerbanganDipilih_0096);
                            DaftarPenumpang_0096.add(penumpang);
                            System.out.println("Pembelian Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)");
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                case 3:
                    // Tampilkan pesanan tiket
                    if (DaftarPenumpang_0096.size() == 0) {
                        System.out.println("Pembelian Tiket Tidak Ada");
                    } else {
                        System.out.println("====== Detail Tiket Penerbangan ======");
                        for (Penumpang penumpang : DaftarPenumpang_0096) {
                            penumpang.tampilDaftarPenumpang_0096();
                        }
                    }
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    running = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
            System.out.println(); // spasi antar menu
        }
        scanner.close();
    }
}

class Penerbangan {
    private String Nomorpenerbangan;
    private String BandaraKeberangkatan_0096;
    private String BandaraTujuan_0096;
    private String WaktuKeberangkatan_0096;
    private String WaktuKedatangan_0096;
    private float HargaTiket_0096;

    public Penerbangan(String Nomorpenerbangan, String BandaraKeberangkatan_0096, String BandaraTujuan_0096, String WaktuKeberangkatan_0096, String WaktuKedatangan_0096, float HargaTiket_0096) {
        this.Nomorpenerbangan = Nomorpenerbangan;
        this.BandaraKeberangkatan_0096 = BandaraKeberangkatan_0096;
        this.BandaraTujuan_0096 = BandaraTujuan_0096;
        this.WaktuKeberangkatan_0096 = WaktuKeberangkatan_0096;
        this.WaktuKedatangan_0096 = WaktuKedatangan_0096;
        this.HargaTiket_0096 = HargaTiket_0096;
    }

    public void tampilDaftarpenerbangan() {
        System.out.println("Nomor Penerbangan: " + Nomorpenerbangan);
        System.out.println("Bandara Keberangkatan: " + BandaraKeberangkatan_0096 + " ---> Bandara Tujuan: " + BandaraTujuan_0096);
        System.out.println("Waktu Keberangkatan: " + WaktuKeberangkatan_0096 + " ---> Waktu Kedatangan: " + WaktuKedatangan_0096);
        System.out.println("Harga Tiket: Rp." + HargaTiket_0096);
        System.out.println("----------------------------");
    }

    public String getNomorpenerbangan() {
        return Nomorpenerbangan;
    }

    public String getBandaraKeberangkatan_0096() {
        return BandaraKeberangkatan_0096;
    }

    public String getBandaraTujuan_0096() {
        return BandaraTujuan_0096;
    }

    public String getWaktuKeberangkatan_0096() {
        return WaktuKeberangkatan_0096;
    }

    public String getWaktuKedatangan_0096() {
        return WaktuKedatangan_0096;
    }

    public float getHargaTiket_0096() {
        return HargaTiket_0096;
    }
}

class Penumpang {
    private String NIK_0096;
    private String NamaDepan_0096;
    private String NamaBelakang_0096;
    private Penerbangan penerbangan;

    public Penumpang(String NIK_0096, String NamaDepan_0096, String NamaBelakang_0096, Penerbangan penerbangan) {
        this.NIK_0096 = NIK_0096;
        this.NamaDepan_0096 = NamaDepan_0096;
        this.NamaBelakang_0096 = NamaBelakang_0096;
        this.penerbangan = penerbangan;
    }

    public void tampilDaftarPenumpang_0096() {
        System.out.println("Nomor ID Kependudukan: " + NIK_0096);
        System.out.println("Nama Depan: " + NamaDepan_0096);
        System.out.println("Nama Belakang: " + NamaBelakang_0096);
        System.out.println("Nomor Penerbangan: " + penerbangan.getNomorpenerbangan());
        System.out.println("Bandara Keberangkatan: " + penerbangan.getBandaraKeberangkatan_0096() + " ---> Bandara Tujuan: " + penerbangan.getBandaraTujuan_0096());
        System.out.println("Waktu Keberangkatan: " + penerbangan.getWaktuKeberangkatan_0096() + " ---> Waktu Kedatangan: " + penerbangan.getWaktuKedatangan_0096());
        System.out.println("Harga Tiket: Rp." + penerbangan.getHargaTiket_0096());
        System.out.println("----------------------------");
    }
}
