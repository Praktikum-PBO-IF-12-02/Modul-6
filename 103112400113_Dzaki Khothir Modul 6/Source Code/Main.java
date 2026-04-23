public class Main {
    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("Mas Amba", "690696069", 5000000, 1000000);
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("Mas Fuad", "808080", 3000000, 6);

        karyawanTetap.tampilkanInfo();
        karyawanTetap.hitungGaji();

        karyawanKontrak.tampilkanInfo();
        karyawanKontrak.hitungGaji();
    }
}