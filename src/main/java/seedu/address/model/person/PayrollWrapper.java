package seedu.address.model.person;

public class PayrollWrapper {
    private final Person person;
    private double hoursWorked = 0;


    public PayrollWrapper(Person person, double hoursWorked) {
        this.person = person;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return person.getName().toString();
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPay() {
        return hoursWorked * person.getPayRate().value;
    }

    @Override
    public int hashCode() {
        return person.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PayrollWrapper)) {
            return false;
        }
        PayrollWrapper otherPayrollWrapper = (PayrollWrapper) other;
        return otherPayrollWrapper.person.equals(this.person);
    }

    @Override
    public String toString() {
        return person.toString() + " Hours Worked: " + hoursWorked;
    }
}
