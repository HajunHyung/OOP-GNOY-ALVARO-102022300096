
import java.util.ArrayList;
import java.util.Scanner;

// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    public static ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    public static ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();;

    Scanner scanner = new Scanner(System.in);
    public void tambahMakananKering() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga Makanan: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan Brand Makanan: ");
        String brand = scanner.nextLine();
        
        // Todo : Create a new object for MakananKering
        MakananKering nKering = new MakananKering(nama, jumlah, harga , brand);
        daftarMakananKering.add(nKering);

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("Makanan Kering Berhasil Ditambahkan.");
    }

    public void tambahMakananBasah() {
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan Nama Makanan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = scanner.nextInt();

        System.out.print("Masukkan Harga Makanan: ");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan Bahan Makanan: ");
        String bahan = scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah nBasah = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(nBasah);

        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan Basah Berhasil Ditambahkan.");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            System.out.println("Tidak Ada Makanan Disini");
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering nKering: daftarMakananKering) {
                nKering.ShowData();
            }
            // Todo : Create print notification for  Makanan Basah
            for (MakananBasah nBasah: daftarMakananBasah) {
                nBasah.ShowData();
            }
        }
    }
}
