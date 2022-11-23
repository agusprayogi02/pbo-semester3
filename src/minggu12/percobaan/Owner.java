package minggu12.percobaan;

public class Owner {
  public void pay(Payable p) {
    System.out.println("Total payment = " + p.getPaymentAmount());
    if (p instanceof Employee) {
      Employee e = (Employee) p;
      System.out.println("" + e.getEmployeeInfo());
    } else if (p instanceof ElectricityBill) {
      ElectricityBill eBill = (ElectricityBill) p;
      System.out.println("" + eBill.getBillInfo());
    }
  }

  public void showMyEmployee(Employee e) {
    System.out.println("" + e.getEmployeeInfo());
    if (e instanceof PermanenEmployee) {
      System.out.println("You have to pay her/him monthly!!!");
    } else {
      System.out.println("No need to pay him/her :)");
    }
  }
}
