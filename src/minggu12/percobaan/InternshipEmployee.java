package minggu12.percobaan;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InternshipEmployee extends Employee {

    private int length;

    public InternshipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
}
