package minggu4.percobaan3;

public class MainPertanyaan {
  public static void main(String[] args) {
    Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
    Pegawai asisten = new Pegawai("4567", "Patrick Star");
    KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
    keretaApi.setAsisten(asisten);
    System.out.println(keretaApi.info());
  }
}
