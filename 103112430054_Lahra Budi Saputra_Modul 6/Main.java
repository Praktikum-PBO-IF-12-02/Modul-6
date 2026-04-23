public class Main {
    public static void main(String[] args) {

        KaryawanTetap kt = new KaryawanTetap("Budi", "123", 5000000, 1500000);
        KaryawanKontrak kk = new KaryawanKontrak("Andi", "456", 4000000, 6, 500000);

        System.out.println("=== Karyawan Tetap ===");
        kt.tampilInfo();

        System.out.println("\n=== Karyawan Kontrak ===");
        kk.tampilInfo();
    }
}