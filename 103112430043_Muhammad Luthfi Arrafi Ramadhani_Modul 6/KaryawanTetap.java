class KaryawanTetap extends Karyawan {
    double tunjangan;
    
    KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    @Override
    double hitungGaji() {
        return gajiPokok + tunjangan;
    }
    
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}