class KaryawanKontrak extends Karyawan {
    int durasiKontrak;
    double bonusPerBulan;

    KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    double hitungGaji() {
        return gajiPokok + (bonusPerBulan * durasiKontrak);
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
        System.out.println("Bonus/Bulan: " + bonusPerBulan);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}