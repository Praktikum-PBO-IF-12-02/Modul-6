class Karyawan {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Karyawan(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void tampilInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("NIP        : " + nip);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
    }
}


class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tunjangan  : Rp" + tunjangan);
        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}


class KaryawanKontrak extends Karyawan {
    private int durasiKontrak; // dalam bulan
    private double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, double gajiPokok, int durasiKontrak, double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + bonusPerBulan;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Durasi     : " + durasiKontrak + " bulan");
        System.out.println("Bonus/Bulan: Rp" + bonusPerBulan);
        System.out.println("Total Gaji : Rp" + hitungGaji());
    }
}

public class Main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Adrian", "T-001", 6000000, 2500000);
        KaryawanKontrak kk = new KaryawanKontrak("Bastian", "K-023", 4500000, 12, 500000);

        System.out.println("=== DATA KARYAWAN TETAP ===");
        kt.tampilInfo();

        System.out.println("\n=== DATA KARYAWAN KONTRAK ===");
        kk.tampilInfo();
    }
}