package minggu6.percobaan3;

public class Tabung extends Bangun {
    protected int t;

    public void setT(int t) {
        this.t = t;
    }

    public void setSuperR(int r) {
        super.r = r;
    }

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void volume() {
        System.out.println("Volume Tabung adalah: " +
                (super.phi * super.r * super.r * t));
    }
}
