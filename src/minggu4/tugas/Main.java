package minggu4.tugas;

public class Main{
    public static void main(String[] args) {
        Pemilik pemilik = new Pemilik("123456789", "Rizki", "Jl. Cikutra", "08123456789");
        Motor motor = new Motor("Honda", "Hitam", "B 1234 AB", pemilik);
        Karcis karcis = new Karcis("123", "10-10-2022", motor, "Terparkirkan");
        Petugas petugas = new Petugas("987654321", "Ronaldo", "08123456789");
        petugas.tambahKarcis(karcis);
        pemilik.setKarcis(karcis);
        petugas.tampilData();
    }
}
