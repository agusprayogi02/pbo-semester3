package minggu6.tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarifSKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
}
