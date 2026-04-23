/**
 *
 * @author wahyuuuwid
 */

public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    public double hitungGaji() {
        return getGajiPokok() + (bonusPerBulan * durasiKontrak);
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Durasi Kontrak : " + durasiKontrak + " bulan");
        System.out.printf("Bonus/Bulan    : %.2f\n", bonusPerBulan);
        System.out.printf("Total Gaji     : %.2f\n", hitungGaji());
        System.out.println("------------------------");
    }
}