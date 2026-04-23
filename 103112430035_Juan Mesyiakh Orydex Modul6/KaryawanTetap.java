class KaryawanTetap extends Karyawan {
    double tunjangan;

    KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }


    double hitungGaji() {
        return gajiPokok + tunjangan;
    }


    void tampilInfo() {
        System.out.println("=== Karyawan Tetap ===");
        super.tampilInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}