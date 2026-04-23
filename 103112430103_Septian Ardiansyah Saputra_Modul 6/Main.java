public class Main {
    public static void main(String[] args) {

        KaryawanTetap kt = new KaryawanTetap(
            "Qingque", "KT001", 5000000, 1500000
        );

        KaryawanKontrak kk = new KaryawanKontrak(
            "Sushang", "KK001", 4000000, 6, 500000
        );

        System.out.println("=== Karyawan Tetap ===");
        kt.tampilInfo();

        System.out.println("=== Karyawan Kontrak ===");
        kk.tampilInfo();
    }
}