
package minggu1.praktikum;

public class Ac extends Elektronik {
    private int suhu;
    private double kecepatan;

    public void tambahSuhu() {
        suhu++;
        kecepatan = suhu + 2;
    }

    public void kurangiSuhu() {
        suhu--;
        kecepatan = suhu - 2;
    }

    public int tampilSuhu() {
        return suhu;
    }

    public double cekKecepatan() {
        return kecepatan;
    }
}
