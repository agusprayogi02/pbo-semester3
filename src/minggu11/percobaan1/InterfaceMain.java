package minggu11.percobaan1;

public class InterfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumloude = new Sarjana("Dini");
        PascaSarjana masterCumloude = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumloude);
        pakrektor.beriSertifikatCumlaude(masterCumloude);
    }
}
