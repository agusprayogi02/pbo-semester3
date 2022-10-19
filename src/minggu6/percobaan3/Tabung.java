package minggu6.percobaan3;

public class Tabung extends Bangun {
    protected int t;

    public void setT(int t) {
        this.t = t;
    }

    public void setSuperR(int r) {
        super.setR(r);
    }

    public void setSuperPhi(double phi) {
        super.setPhi(phi);
    }

    public void volume() {
        System.out.println("Volume Tabung adalah: " +
                (super.getPhi() * super.getR() * super.getR() * t));
    }
}
