class Karyawan {
    private String nama;
    private String nip;
    private double gajiPokok;

    public Karyawan(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.printf("Gaji Pokok: %.2f\n", gajiPokok);
    }
}