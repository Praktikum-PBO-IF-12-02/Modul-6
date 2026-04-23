public class Main {
    public static void main(String[] args) {
        KaryawanTetap tetap = new KaryawanTetap("Budi Santoso", "KT001", 5000000, 1500000);
        KaryawanKontrak kontrak = new KaryawanKontrak("Ani Rahmawati", "KK001", 4000000, 6, 500000);

        System.out.println("=== Data Karyawan Tetap ===");
        tetap.tampilInfo();
        System.out.println();
        System.out.println("=== Data Karyawan Kontrak ===");
        kontrak.tampilInfo();
    }
}
