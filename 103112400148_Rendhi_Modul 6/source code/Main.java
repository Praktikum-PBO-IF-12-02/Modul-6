/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul6;

/**
 *
 * @author Rendy
 */
public class Main {
    public static void main(String[] args) {

        KaryawanTetap karyawanTetap =
                new KaryawanTetap("Andi Saputra", "KT001",
                        5000000, 1500000);

        KaryawanKontrak karyawanKontrak =
                new KaryawanKontrak("Budi Santoso", "KK001",
                        4000000, 12, 500000);

        karyawanTetap.tampilInfo();
        karyawanKontrak.tampilInfo();
    }
}
