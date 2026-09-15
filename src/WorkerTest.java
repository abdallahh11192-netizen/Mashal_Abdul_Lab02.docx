import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker worker;

    @BeforeEach
    void setUp() {
        worker = new Worker(
                "John",
                "Doe",
                "000001",
                "Mr.",
                1995,
                20.00
        );
    }

    @Test
    void testHourlyPayRate() {
        assertEquals(20.00, worker.getHourlyPayRate());
    }

    @Test
    void testSetHourlyPayRate() {
        worker.setHourlyPayRate(25.00);
        assertEquals(25.00, worker.getHourlyPayRate());
    }

    @Test
    void testRegularWeeklyPay() {
        assertEquals(800.00, worker.calculateWeeklyPay(40));
    }

    @Test
    void testOvertimeWeeklyPay() {
        assertEquals(950.00, worker.calculateWeeklyPay(45));
    }
    @Test
    void testToCSV() {
        assertEquals("John,Doe,000001,Mr.,1995,20.0", worker.toCSV());
    }
    @Test
    void testToXML() {
        assertEquals(
                "<Person><firstName>John</firstName><lastName>Doe</lastName><ID>000001</ID><title>Mr.</title><YOB>1995</YOB><hourlyPayRate>20.0</hourlyPayRate></Person>",
                worker.toXML()
        );
    }

    @Test
    void testToJSON() {
        assertEquals(
                "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"ID\":\"000001\",\"title\":\"Mr.\",\"YOB\":1995,\"hourlyPayRate\":20.0}",
                worker.toJSON()
        );
    }
}