public class Main {
    public static void main(String[] args) {
        System.out.println("Sistem Pengelola Data Karyawan PT. Maju Bersama\n");

        KaryawanTetap kTetap = new KaryawanTetap("Denna Wahyu", "101928", 5000000, 1500000);
        
        KaryawanKontrak kKontrak = new KaryawanKontrak("Budi Sutopo", "201837", 4000000, 12, 500000);

        kTetap.tampilInfo();
        System.out.println();
        kKontrak.tampilInfo();
    }
}