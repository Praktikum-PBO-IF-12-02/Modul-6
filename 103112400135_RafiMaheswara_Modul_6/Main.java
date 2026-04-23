public class Main {
    public static void main(String[] args) {

        KaryawanTetap kt1 = new KaryawanTetap("Budi Santoso", "KT-001", 5000000, 1500000);
        KaryawanKontrak kk2 = new KaryawanKontrak("Andi Pratama", "KK-002", 4000000, 6, 500000);

        kt1.tampilInfo();
        kk2.tampilInfo();
    }
}