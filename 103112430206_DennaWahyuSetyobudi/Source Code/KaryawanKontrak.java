public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak; // dalam satuan bulan
    private double bonusPerBulan;

    // Constructor
    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonusPerBulan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Data Karyawan Kontrak ");
        super.tampilInfo();
        System.out.println("Durasi : " + durasiKontrak + " bulan");
        System.out.printf("Bonus/Bulan: Rp %,.2f\n", bonusPerBulan);
        System.out.printf("Total Gaji : Rp %,.2f\n", hitungGaji());
    }
}
