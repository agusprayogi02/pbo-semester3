package minggu12.percobaan;

public class Tester4 {
  public static void main(String[] args) {
    Owner ow = new Owner();
    ElectricityBill eBill = new ElectricityBill(5, "R-1");
    ow.pay(eBill);
    System.out.println("-----------------------------");

    PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
    ow.pay(pEmp);
    System.out.println("-----------------------------");

    InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    ow.showMyEmployee(pEmp);
    System.out.println("-----------------------------");
    ow.showMyEmployee(iEmp);
  }
}
