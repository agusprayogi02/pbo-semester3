package minggu12.percobaan;

public class Tester1 {

  public static void main(String[] args) {
    PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
    InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    ElectricityBill eBill = new ElectricityBill(5, "A-1");
    Employee e;
    Payable p;
    e = pEmp;
    e = iEmp;
    p = pEmp;
    p = eBill;
    // p = iEmp;
    // e = eBill;
  }
}