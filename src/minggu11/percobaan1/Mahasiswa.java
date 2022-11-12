package minggu11.percobaan1;

public class Mahasiswa {
    private String nama;
    
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah dikampus");
    }
}
