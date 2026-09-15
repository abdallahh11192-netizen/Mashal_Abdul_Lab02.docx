public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID,
                  String title, int YOB, double hourlyPayRate) {

        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(hoursWorked - 40, 0);

        double regularPay = regularHours * hourlyPayRate;
        double overtimePay = overtimeHours * hourlyPayRate * 1.5;
        double totalPay = calculateWeeklyPay(hoursWorked);

        System.out.println("Regular Hours: " + regularHours);
        System.out.println("Regular Pay: $" + regularPay);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Overtime Pay: $" + overtimePay);
        System.out.println("Total Pay: $" + totalPay);
    }
    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * hourlyPayRate * 1.5;

            return regularPay + overtimePay;
        }
    }
    @Override
    public String toCSV() {
        return super.toCSV() + "," + hourlyPayRate;
    }
    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<hourlyPayRate>" + hourlyPayRate + "</hourlyPayRate></Person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ",\"hourlyPayRate\":" + hourlyPayRate + "}");
    }
}