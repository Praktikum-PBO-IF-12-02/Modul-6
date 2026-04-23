public class Karyawantetap extends Karyawan {
    private double tunjangan;

    public Karyawantetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Karyawan Tetap =====");
        System.out.println("Nama      : " + nama);
        System.out.println("NIP       : " + nip);
        System.out.printf("Gaji Pokok: Rp %,.2f%n", gajiPokok);
        System.out.printf("Tunjangan : Rp %,.2f%n", tunjangan);
        System.out.printf("Total Gaji: Rp %,.2f%n", hitungGaji());
        System.out.println("==========================");
    }
}