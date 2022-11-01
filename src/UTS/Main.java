package UTS;

public class Main {
  public static void main(String[] args) {
    Obat o1 = new Obat(5000, "Panadol");
    Obat o2 = new Obat(2000, "Tolak Angin");
    ObatHerbal hb = new ObatHerbal(10000, "STMJ", "Jamu");
    Obat o[] = { o1, o2, hb };
    Pasien p1 = new Pasien();
    p1.nama = "Paul";
    p1.ob = o;
    p1.print();
    PasienBpjs p2 = new PasienBpjs();
    p2.nama = "Pagba";
    p2.ob = o;
    p2.print();
  }
}
