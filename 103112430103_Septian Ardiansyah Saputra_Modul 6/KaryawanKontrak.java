public class KaryawanKontrak extends Karyawan {
    int durasiKontrak;
    double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    public double hitungGaji() {
        return gajiPokok + (bonusPerBulan * durasiKontrak);
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Durasi Kontrak (bulan) : " + durasiKontrak);
        System.out.println("Bonus per Bulan : " + bonusPerBulan);
        System.out.println("Total Gaji : " + hitungGaji());
        System.out.println("----------------------------");
    }
}