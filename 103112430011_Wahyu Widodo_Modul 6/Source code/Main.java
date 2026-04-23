/**
 *
 * @author wahyuuuwid
 */

public class Main {
    public static void main(String[] args) {

        // Objek untuk Karyawan Tetap
        KaryawanTetap kt = new KaryawanTetap("Zilong", "KT001", 5000000, 1000000);

        // Objek untuk Karyawan Kontrak
        KaryawanKontrak kk = new KaryawanKontrak( "Ling", "KK001", 4000000, 12, 100000);

        // Tampilkan info
        System.out.println("=== Karyawan Tetap ===");
        kt.tampilInfo();

        System.out.println("=== Karyawan Kontrak ===");
        kk.tampilInfo();
    }
}