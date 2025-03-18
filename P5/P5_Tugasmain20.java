public class P5_Tugasmain20 {
    
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        
        P5_Tugas nm = new P5_Tugas(nilaiUTS, nilaiUAS);

        int maxUTS = nm.cariNIlaiTertinggiDC(0, nilaiUTS.length - 1);
        int minUTS = nm.cariNIlaiTerendahDC(0, nilaiUTS.length - 1);
        double avgUAS = nm.CariRataBF();
        
        System.out.println("Nilai UTS tertinggi: " + maxUTS);
        System.out.println("Nilai UTS terendah: " + minUTS);
        System.out.println("Rata-rata nilai UAS: " + avgUAS);
    }
}
