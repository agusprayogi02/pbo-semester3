package minggu7.percobaan;

public class StaffHarian extends Staff {
    public int jmlJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(String nama, String alamat, String jk,
            int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilDataStaffHarian() {
        System.out.println("=".repeat(12) + "Data Staff Harian " + "=".repeat(12));
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja    : " + jmlJamKerja);
        System.out.println("Gaji Bersih         : Rp " + (jmlJamKerja * gaji + lembur - potongan));
    }
}
