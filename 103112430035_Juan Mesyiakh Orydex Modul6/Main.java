public class Main {
    public static void main(String[] args) {

        KaryawanTetap kt = new KaryawanTetap("Joko", "001", 5000000, 1000000);
        KaryawanKontrak kk = new KaryawanKontrak("Tingkir", "002", 4000000, 6, 500000);

        kt.tampilInfo();
        System.out.println();

        kk.tampilInfo();
        System.out.println();

        double totalGaji = kt.hitungGaji() + kk.hitungGaji();
        System.out.println("Total Gaji Semua Karyawan: " + totalGaji);
    }
}