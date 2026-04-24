class Karyawan {
    String nama;
    String nip;
    double gajiPokok;
    
    Karyawan(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }
    
    double hitungGaji() {
        return gajiPokok;
    }
    
    void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}