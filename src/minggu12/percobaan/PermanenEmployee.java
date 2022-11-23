package minggu12.percobaan;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermanenEmployee extends Employee implements Payable {
  private int salary;

  public PermanenEmployee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int getPaymentAmount() {
    return (int) (salary + 0.05 * salary);
  }

  @Override
  public String getEmployeeInfo() {
    String info = super.getEmployeeInfo() + "\n";
    info += "Registered as permanent employee with salary " + salary + "\n";
    return info;
  }
}