package minggu4.percobaan1;

public class MainPercobaan1 {
  public static void main(String[] args) {
    Processor p1 = new Processor(); // konstruktor default
    Laptop lapy = new Laptop("Thinkpad", p1); // konstaktor berparameter

    p1.setMerk("Intel i5");
    p1.setCache(4);
    Laptop L1 = new Laptop();
    L1.setMerk("Thinkpad");
    L1.setProc(p1);
    L1.info();
  }
}
