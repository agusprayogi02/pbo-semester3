package minggu11.percobaan1;

public class PascaSarjana extends Mahasiswa implements ICumlaude {
    @Override
    public void perkenalan() {
        super.kuliahDiKampus();
    }

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaukan TESIS");
    }

    @Override
    public void meriahIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

}
