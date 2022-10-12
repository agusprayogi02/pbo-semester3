package minggu7.percobaan;

public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-Laki", 20, 200000, 250000, 200000, "2A", 100000);
        ST.tampilDataStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilDataStaffHarian();
    }
}
