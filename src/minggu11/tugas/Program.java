package minggu11.tugas;

public class Program {
  public static void main(String[] args) {
    Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-Abu");
    Gorilla gorilla = new Gorilla("Gulali", 4, "Haaum Haaum", "Hitam Manis");
    Singa singa = new Singa("CingaCing", 4, "Roaar Roaar", "Coklat");

    keledai.displayData();
    gorilla.displayData();
    singa.displayData();
  }
}
