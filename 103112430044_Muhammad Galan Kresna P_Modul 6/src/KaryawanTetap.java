public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    public double hitungGaji() {
        return getGajiPokok() + tunjangan;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.printf("Tunjangan  : %.2f\n", tunjangan);
        System.out.printf("Total Gaji : %.2f\n", hitungGaji());
        System.out.println("------------------------");
    }
}