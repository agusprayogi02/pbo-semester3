package minggu6.tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);
        Dosen d1 = new Dosen("128", "Rizki", "Malang");
        Dosen d2 = new Dosen("129", "Dina", "Surabaya");
        daftarGaji.addPegawai(d1);
        daftarGaji.addPegawai(d2);
        d1.setGaji(5000000);
        d2.setGaji(3000000);
        d1.setSKS(12);
        d2.setSKS(10);
        daftarGaji.printSemuaGaji();
    }
}
