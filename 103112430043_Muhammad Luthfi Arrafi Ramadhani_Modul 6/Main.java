public class Main {
    public static void main(String[] args) {
        KaryawanTetap k1 = new KaryawanTetap("Rusdi", "KT034", 6000000, 1500000);
        KaryawanKontrak k2 = new KaryawanKontrak("Sari", "KK028", 4500000, 12, 500000);
        
        System.out.println("=== KARYAWAN TETAP ===");
        k1.tampilInfo();
        
        System.out.println("\n=== KARYAWAN KONTRAK ===");
        k2.tampilInfo();
    }
}