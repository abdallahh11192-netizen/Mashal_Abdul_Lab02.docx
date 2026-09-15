import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker salaryWorker;

    @BeforeEach
    void setUp() {
        salaryWorker = new SalaryWorker(
                "John",
                "Doe",
                "000001",
                "Mr.",
                1995,
                20.00,
                52000.00
        );
    }

    @Test
    void testAnnualSalary() {
        assertEquals(52000.00, salaryWorker.getAnnualSalary());
    }

    @Test
    void testSetAnnualSalary() {
        salaryWorker.setAnnualSalary(60000.00);
        assertEquals(60000.00, salaryWorker.getAnnualSalary());
    }

    @Test
    void testWeeklyPay() {
        assertEquals(1000.00, salaryWorker.calculateWeeklyPay(40));
    }
}