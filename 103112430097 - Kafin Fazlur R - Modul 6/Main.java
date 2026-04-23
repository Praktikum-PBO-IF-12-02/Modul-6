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
        System.out.println("Nama        : " + nama);
        System.out.println("NIP         : " + nip);
        System.out.println("Gaji Pokok  : " + gajiPokok);
    }
}

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
        System.out.println("Karyawan Tetap");
        super.tampilInfo();
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + hitungGaji());
        System.out.println();
    }
}

class KaryawanKontrak extends Karyawan {
    int durasiKontrak;
    double bonusPerBulan;

    KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    double hitungGaji() {
        return gajiPokok + bonusPerBulan;
    }

    void tampilInfo() {
        System.out.println("Karyawan Kontrak");
        super.tampilInfo();
        System.out.println("Durasi Kontrak : " + durasiKontrak + " bulan");
        System.out.println("Bonus/Bulan    : " + bonusPerBulan);
        System.out.println("Total Gaji     : " + hitungGaji());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        KaryawanTetap kt = new KaryawanTetap(
                "Mas Wowo", "12345", 5000000, 1000000
        );

        KaryawanKontrak kk = new KaryawanKontrak(
                "Mas Owi", "67890", 4000000, 6, 500000
        );

        kt.tampilInfo();
        kk.tampilInfo();
    }
}