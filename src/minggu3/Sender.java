package minggu3;

class Sender {
  public void send(String msg) {
    synchronized (this) {
      System.out.println("Sending\t" + msg);
      try {
        Thread.sleep(10000);
      } catch (Exception e) {
        System.out.println("Thread interrupted.");
      }
      System.out.println("\n" + msg + "Sent");
    }
  }
}