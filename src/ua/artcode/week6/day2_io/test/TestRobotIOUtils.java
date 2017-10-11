package ua.artcode.week6.day2_io.test;

import org.junit.Assert;
import org.junit.Test;
import ua.artcode.week6.day2_io.model.Robot;
import ua.artcode.week6.day2_io.utils.IOUtils;

import java.io.FileNotFoundException;

public class TestRobotIOUtils {

    private static final String TEST_PATH_WRITE = "test-resources/week6_day2_io/robot1.txt";

    private static final String TEST_PATH_READ = "test-resources/week6_day2_io/robot2.txt";

    private static final String TEST_PATH_SAVE = "test-resources/week6_day2_io/robot3.txt";

    private static final String TEST_PATH_LOAD = "test-resources/week6_day2_io/robot4.txt";

    @Test
    public void writeRobot() {
        Robot testRobot = new Robot(1, "NN34", 100_000.1111);

        try {   // Must write line "id:1,model:NN34,price:100000.11" to file TEST_PATH_WRITE !
            IOUtils.writeRobot(TEST_PATH_WRITE, testRobot);
        } catch (Exception e) {
            Assert.fail("was caught Exception");
            e.printStackTrace();
        }

    }

    @Test
    public void readRobot() {
        Robot expectedRobot = new Robot(2, "MM66", 55500.55);

        try {
            Robot testRobot = IOUtils.readRobot(TEST_PATH_READ);
            Assert.assertEquals(testRobot, expectedRobot);
        } catch (FileNotFoundException fnfe) {
            Assert.fail("was caught FileNotFoundException");
            fnfe.printStackTrace();
        } catch (Exception e) {
            Assert.fail("was caught Exception");
            e.printStackTrace();
        }
    }

    @Test
    public void save() {
        Robot testRobot = new Robot(1, "A3", 3000);
        try {
            IOUtils.<Robot>save(testRobot, TEST_PATH_SAVE);
        } catch (Exception e) {
            Assert.fail("was caught Exception");
        }
    }

    @Test
    public void load() {
        Robot expectedRobot = new Robot(1, "A3", 3000);
        try {
            Robot testRobot = IOUtils.load(TEST_PATH_LOAD); // we can write without <Robot>
            Assert.assertEquals(expectedRobot, testRobot);
        } catch (FileNotFoundException fnfe) {
            System.out.println("was caught FileNotFoundException");
        }
        catch (Exception e) {
            Assert.fail("was caught Exception");
        }
    }

}
