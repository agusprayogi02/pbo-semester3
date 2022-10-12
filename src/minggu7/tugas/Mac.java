package minggu7.tugas;

public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public void show() {
        System.out.println("Class Mac");
    }

    public Mac(String merk, int kecProsesor, int sizeMemory,
               String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac(){
        super.tampilLaptop();
        super.show();
        System.out.println("Security            : "+security);
    }
}
