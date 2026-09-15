public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID,
                        String title, int YOB, double hourlyPayRate,
                        double annualSalary) {

        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Weekly Pay: $" + weeklyPay);
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>",
                "<annualSalary>" + annualSalary + "</annualSalary></Person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}",
                ",\"annualSalary\":" + annualSalary + "}");
    }
}