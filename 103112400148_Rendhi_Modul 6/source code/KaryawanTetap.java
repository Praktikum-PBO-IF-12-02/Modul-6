/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul6;

/**
 *
 * @author Rendy
 */
class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip,
                         double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public double hitungGaji() {
        return getGajiPokok() + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Karyawan Tetap ===");
        super.tampilInfo();
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println();
    }
}