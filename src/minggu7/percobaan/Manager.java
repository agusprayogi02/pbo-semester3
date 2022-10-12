package minggu7.percobaan;

public class Manager extends Karyawan {
    public int tunjangan;

    public Manager() {
    }

    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan Manager   : Rp "+tunjangan);
    }
}
