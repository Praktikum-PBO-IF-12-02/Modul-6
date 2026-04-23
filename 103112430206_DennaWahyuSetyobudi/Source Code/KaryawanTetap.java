public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Data Karyawan Tetap ");
        super.tampilInfo(); 
        System.out.printf("Tunjangan  : Rp %,.2f\n", tunjangan);
        System.out.printf("Total Gaji : Rp %,.2f\n", hitungGaji());
    }
}