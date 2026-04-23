public class Karyawankontrak extends Karyawan {
    private int durasiKontrak;
    private double bonusPerBulan;

    public Karyawankontrak(String nama, String nip, double gajiPokok,
                           int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (bonusPerBulan * durasiKontrak);
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Karyawan Kontrak =====");
        System.out.println("Nama           : " + nama);
        System.out.println("NIP            : " + nip);
        System.out.printf("Gaji Pokok     : Rp %,.2f%n", gajiPokok);
        System.out.printf("Bonus/Bulan    : Rp %,.2f%n", bonusPerBulan);
        System.out.println("Durasi Kontrak : " + durasiKontrak + " bulan");
        System.out.printf("Total Gaji     : Rp %,.2f%n", hitungGaji());
        System.out.println("============================");
    }
}