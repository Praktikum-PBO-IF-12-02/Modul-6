class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (durasiKontrak * bonusPerBulan);
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Durasi Kontrak : " + durasiKontrak + " bulan");
        System.out.println("Bonus Per Bulan: " + bonusPerBulan);
        System.out.println("Total Gaji     : " + hitungGaji());
    }
}