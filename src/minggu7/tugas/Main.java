package minggu7.tugas;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows("Asus", 3, 8,
                "Intel Core i7", "Lithium Polymer", "Windows 10");
        windows.tampilWindows();
        System.out.println("===================================");
        Mac mac = new Mac("Macbook Pro", 2, 4,
                "Intel Core i5", "Lithium Polymer", "Mac OS");
        mac.tampilMac();

        Laptop lap = new Windows();
        lap.show();
    }
}
