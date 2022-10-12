package minggu7.percobaan;

public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public Karyawan() {
    }

    public void tampilDataKaryawan(){
        System.out.println("Nama Karyawan       : "+nama);
        System.out.println("Alamat              : "+alamat);
        System.out.println("Jenis Kelamin       : "+jk);
        System.out.println("Umur                : "+umur);
        System.out.println("Gaji                : Rp "+gaji);
    }
}