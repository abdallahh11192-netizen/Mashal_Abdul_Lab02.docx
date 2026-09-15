import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", "Doe", "000001", "Mr.", 1995, 20.00));
        workers.add(new Worker("Jane", "Smith", "000002", "Ms.", 1998, 22.00));
        workers.add(new Worker("Mike", "Brown", "000003", "Mr.", 1992, 25.00));
        workers.add(new SalaryWorker("Sarah", "Wilson", "000004", "Ms.", 1990, 30.00, 52000));
        workers.add(new SalaryWorker("David", "Miller", "000005", "Mr.", 1988, 35.00, 62400));
        workers.add(new SalaryWorker("Emily", "Davis", "000006", "Ms.", 1993, 28.00, 72800));
        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {

            System.out.println("\n========== WEEK " + (week + 1) + " ==========");

            for (Worker worker : workers) {
                worker.displayWeeklyPay(weeklyHours[week]);
                System.out.println("--------------------");
            }
        }
    }

}