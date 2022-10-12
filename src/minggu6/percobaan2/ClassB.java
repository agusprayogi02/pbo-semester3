package minggu6.percobaan2;

public class ClassB extends ClassA {
    private int z;

    public int getNilaiZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void getJumlah() {
        System.out.println("jumlah: " + (x + y + z));
    }
}
