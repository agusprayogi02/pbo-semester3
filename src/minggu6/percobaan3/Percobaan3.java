package minggu6.percobaan3;

public class Percobaan3 {

    public static void main(String[] args) {
        Tabung tabung = new Tabung();
        Bangun bangun = new Bangun();
        bangun.setPhi(1.2);
        tabung.setSuperPhi(3.14);
        tabung.setSuperR(10);
        tabung.setT(3);
        tabung.volume();
    }
}
