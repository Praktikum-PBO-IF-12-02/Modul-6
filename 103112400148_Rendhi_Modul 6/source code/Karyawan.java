/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul6;

/**
 *
 * @author Rendy
 */
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
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}