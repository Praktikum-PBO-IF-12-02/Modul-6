public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("Sistem Penggajian PT. Maju Bersama");
        System.out.println("=========================================\n");

        // Membuat objek Karyawan Tetap
        KaryawanTetap kt = new KaryawanTetap("Andi Saputra", "KT1001", 5000000, 1500000);
        kt.tampilInfo();
        
        System.out.println();

        // Membuat objek Karyawan Kontrak
        KaryawanKontrak kk = new KaryawanKontrak("Budi Santoso", "KK2001", 4000000, 12, 500000);
        kk.tampilInfo();
    }
}
