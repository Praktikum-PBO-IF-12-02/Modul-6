public class KaryawanTetap extends Karyawan {
    double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Total Gaji : " + hitungGaji());
        System.out.println("----------------------------");
    }
}