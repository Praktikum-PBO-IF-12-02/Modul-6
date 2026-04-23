public class Main {
    public static void main(String[] args) {

        Karyawantetap kt1 = new Karyawantetap(
            "Budi Santoso",
            "KT-001",
            5_000_000,
            1_500_000
        );

        Karyawantetap kt2 = new Karyawantetap(
            "Siti Rahayu",
            "KT-002",
            6_500_000,
            2_000_000
        );

        Karyawankontrak kk1 = new Karyawankontrak(
            "Andi Wijaya",
            "KK-001",
            4_000_000,
            12,
            500_000
        );

        Karyawankontrak kk2 = new Karyawankontrak(
            "Dewi Lestari",
            "KK-002",
            3_500_000,
            6,
            750_000
        );

        kt1.tampilInfo();
        System.out.println();

        kt2.tampilInfo();
        System.out.println();

        kk1.tampilInfo();
        System.out.println();

        kk2.tampilInfo();
    }
}