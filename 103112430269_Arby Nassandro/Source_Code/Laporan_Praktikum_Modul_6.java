class Karyawan {
  String nama;
  String nip;
  int gajiPokok;

  Karyawan(String nama, String nip, int gaji) {
    this.nama = nama;
    this.nip = nip;
    this.gajiPokok = gaji;
  }

  int hitungGaji() {
    return gajiPokok;
  }

  void tampilInfo() {
    System.out.println("=======  Info Detail Data Karyawan  =====");
    System.out.println("Nama Karyawan    : " + nama);
    System.out.println("Nip karyawan     : " + nip);
    System.out.println("Gaji Pokok       : " + gajiPokok);
  }
}


class KaryawanTetap extends Karyawan {
  int tunjangan;

  KaryawanTetap(String nama, String nip, int gaji, int tunjangan) {
    super(nama, nip, gaji);
    this.tunjangan = tunjangan;
  }

  @Override
  int hitungGaji() {
    return gajiPokok + tunjangan;
  }

  @Override
  void tampilInfo() {
    super.tampilInfo();
    System.out.println("Tunjangan        : " + tunjangan);
    System.out.println("Gaji Karyawan    : " + hitungGaji());
    System.out.println("================ Selesai ================");
  }
}

class KaryawanKontrak extends Karyawan{
  String durasiKontrak;
  int bonusPerbulan;

  KaryawanKontrak(String nama, String nip, int gajiPokok, String kontrak, int bonus) {
    super(nama, nip, gajiPokok);
    this.durasiKontrak = kontrak;
    this.bonusPerbulan = bonus;
  }

  @Override
  int hitungGaji() {
    return gajiPokok + bonusPerbulan;
  }

  @Override
  void tampilInfo() {
    super.tampilInfo();
    System.out.println("Bonus/Bulan      : " + bonusPerbulan);
    System.out.println("Gaji Karyawan    : " + hitungGaji());
    System.out.println("Durasi Kontrak   : " + durasiKontrak);
    System.out.println("================ Selesai ================");
  }
}


public class Laporan_Praktikum_Modul_6 {
  public static void main(String[] args) {
    Karyawan employee = new Karyawan("Arby Nassandro", "10001", 2450000);
    employee.tampilInfo();
    System.out.println();

    KaryawanTetap senior = new KaryawanTetap("Arby Nassandro", "10002", 2450000, 1000000);
    senior.tampilInfo();
    System.out.println();

    KaryawanKontrak junior = new KaryawanKontrak("Arby Nassandro", "10003", 2450000, "2 bulan", 500000);
    junior.tampilInfo();
    System.out.println();
  }
}
