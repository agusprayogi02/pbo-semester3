package minggu11.percobaan1;

public class Sarjana extends Mahasiswa implements ICumlaude {

    @Override
    public void perkenalan() {
        super.kuliahDiKampus();
    }

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meriahIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
