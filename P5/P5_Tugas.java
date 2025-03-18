public class P5_Tugas {
    private int[] nilaiUTS;
    private int[] nilaiUAS;

    public P5_Tugas(int[] uts, int[] uas) {
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }
    

    public int cariNIlaiTertinggiDC(int l, int r) {
        if (l == r) return nilaiUTS[l];
        int mid = (l + r) / 2;
        int lMax = cariNIlaiTertinggiDC(l, mid);
        int rMax = cariNIlaiTertinggiDC(mid + 1, r);
        return Math.max(lMax, rMax);
    }

    public int cariNIlaiTerendahDC(int l, int r) {
        if (l == r) return nilaiUTS[l];
        int mid = (l + r) / 2;
        int lMin = cariNIlaiTerendahDC(l, mid);
        int rMin = cariNIlaiTerendahDC(mid + 1, r);
        return Math.min(lMin, rMin);
    }

    public double CariRataBF() {
        double total = 0;
        for (int num : nilaiUAS) {
            total += num;
        }
        return total / nilaiUAS.length;
    }
    
}
