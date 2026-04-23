public class Main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Andi", "001", 5000000, 2000000);
        KaryawanKontrak kk = new KaryawanKontrak("Budi", "002", 4000000, 6, 500000);

        System.out.println("=== Karyawan Tetap ===");
        kt.tampilInfo();

        System.out.println("\n=== Karyawan Kontrak ===");
        kk.tampilInfo();
    }
}