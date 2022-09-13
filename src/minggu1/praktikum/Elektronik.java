package minggu1.praktikum;

public class Elektronik {

    private boolean tombolOnOff;

    public void nyalakan() {
        tombolOnOff = true;
    }

    public void matikan() {
        tombolOnOff = false;
    }

    public boolean tampilStatus() {
        return tombolOnOff;
    }
}
