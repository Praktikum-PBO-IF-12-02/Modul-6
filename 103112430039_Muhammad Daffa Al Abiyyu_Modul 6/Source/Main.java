public class Main {
    public static void main(String[] args) {
        KaryawanTetap k1 = new KaryawanTetap("Nurdi", "KT0404", 10000000, 100000);
        KaryawanKontrak k2 = new KaryawanKontrak("Fahri", "KK0102", 3600000, 1, 600000);
        
        System.out.println("--- KARYAWAN TETAP ---");
        k1.tampilInfo();
        
        System.out.println("\n--- KARYAWAN KONTRAK ---");
        k2.tampilInfo();
    }
}