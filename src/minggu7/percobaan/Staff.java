package minggu7.percobaan;

public class Staff extends Karyawan {
    public int lembur, potongan;

    public Staff() {
    }

    public Staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembur              :  Rp "+lembur);
        System.out.println("Potongan            :  Rp "+potongan);
    }
}
