package minggu7.percobaan;

public class StaffTetap extends Staff {
    public String golongan;
    public int asuransi;

    public StaffTetap() {
    }

    public StaffTetap(String nama, String alamat, String jk, int umur,
                      int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilDataStaffTetap(){
        System.out.println("=".repeat(12)+"Data Staff Tetap "+"=".repeat(12));
        super.tampilDataStaff();
        System.out.println("Golongan            : "+golongan);
        System.out.println("Jumlah Asuransi     : Rp "+asuransi);
    }
}
