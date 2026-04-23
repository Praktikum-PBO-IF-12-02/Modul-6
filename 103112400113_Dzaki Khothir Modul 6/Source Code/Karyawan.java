class Karyawan {
    private String nama;
    private String nip;
    private int gaji;

    public Karyawan(String nama, String nip, int gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    public void hitungGaji() {
        System.out.println("Gaji Karyawan: " + gaji);
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji: " + gaji);
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public int getGaji() {
        return gaji;
    }
}