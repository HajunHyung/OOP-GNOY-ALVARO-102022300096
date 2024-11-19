

public class Main {
    public static void main(String[] args) {
        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer = new Komputer(20, "Cyber Sentinel", 20000);
        // To do: Panggillah Method Informasi dari class Komputer
        komputer.Informasi();

        System.out.println();
        System.out.println("===================");
        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputerVIP = new KomputerVIP(10, "Cyber Sentinel", 50000, true);
        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputerVIP.Informasi();

        // To do: Panggillah Method Login
        komputerVIP.Login("Dadang");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputerVIP.Bermain(3);
        komputerVIP.Bermain(5, 300);
        
        System.out.println();
        System.out.println("==================");
        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputerPremium = new KomputerPremium(15, "Sentinel Cyber", 30000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputerPremium.Informasi();

        // To do: Panggillah Method Pesan
        komputerPremium.Pesan(10);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
       komputerPremium.TambahLayanan("Mie Goreng");
       komputerPremium.TambahLayanan("Mie Rebus", "Es Teh");
    }
}