class KaryawanKontrak extends Karyawan {
    int durasiKontrak;
    double bonusPerBulan;

    KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    
    double hitungGaji() {
        return gajiPokok + (bonusPerBulan * durasiKontrak);
    }

    
    void tampilInfo() {
        System.out.println("=== Karyawan Kontrak ===");
        super.tampilInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
        System.out.println("Bonus/Bulan: " + bonusPerBulan);
    }
}