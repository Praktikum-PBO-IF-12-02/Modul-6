/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul6;

/**
 *
 * @author Rendy
 */
class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private double bonusPerBulan;

    public KaryawanKontrak(String nama, String nip,
                           double gajiPokok,
                           int durasiKontrak,
                           double bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    public int getDurasiKontrak() {
        return durasiKontrak;
    }

    public double getBonusPerBulan() {
        return bonusPerBulan;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + bonusPerBulan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Karyawan Kontrak ===");
        super.tampilInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
        System.out.println("Bonus per Bulan: " + bonusPerBulan);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println();
    }
}