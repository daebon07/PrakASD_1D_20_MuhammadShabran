package P3;

public class DataDosen20 {
    public static void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen20 dosen : arrayOfDosen) {
            dosen.display();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Berdasarkan Jenis Kelamin:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("\nRata-rata Usia Dosen Berdasarkan Jenis Kelamin:");
        System.out.println("Pria   : " + (countPria == 0 ? "Tidak ada data" : (totalUsiaPria / countPria) + " tahun"));
        System.out.println("Wanita : " + (countWanita == 0 ? "Tidak ada data" : (totalUsiaWanita / countWanita) + " tahun"));
    }

    public static void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        Dosen20 palingTua = arrayOfDosen[0];
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        palingTua.display();
    }

    public static void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        Dosen20 palingMuda = arrayOfDosen[0];
        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        palingMuda.display();
    }
}
