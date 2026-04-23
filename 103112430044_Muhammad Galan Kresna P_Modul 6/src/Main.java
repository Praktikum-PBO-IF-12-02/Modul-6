public class Main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Perlica", "EI002", 5000000, 1000000);

        KaryawanKontrak kk = new KaryawanKontrak( "Chen", "HA004", 4000000, 12, 100000);

        System.out.println("Karyawan Tetap: ");
        kt.tampilInfo();

        System.out.println("Karyawan Kontrak: ");
        kk.tampilInfo();
    }
}