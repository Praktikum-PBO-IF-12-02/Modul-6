public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak; // dalam bulan
    private int bonusPerBulan = 500000; // bonus tetap per bulan

    public KaryawanKontrak(String nama, String nip, int gaji, int durasiKontrak) {
        super(nama, nip, gaji);
        this.durasiKontrak = durasiKontrak;
        
    }

    @Override
    public void hitungGaji() {
        int totalGaji = (getGaji() * durasiKontrak) + (bonusPerBulan * durasiKontrak);
        System.out.println("Gaji Karyawan Kontrak: " + totalGaji);
    }


    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
    }
    
}
