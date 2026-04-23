public class KaryawanTetap extends Karyawan {
    private int tunjangan;

    public KaryawanTetap(String nama, String nip, int gaji, int tunjangan) {
        super(nama, nip, gaji);
        this.tunjangan = tunjangan;
    }


    @Override
    public void hitungGaji() {
        int totalGaji = getGaji() + tunjangan;
        System.out.println("Gaji Karyawan Tetap: " + totalGaji);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
    
}
