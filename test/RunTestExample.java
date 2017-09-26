import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunTestExample {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMyStringArray.class);
        System.out.println("Successful: " + result.wasSuccessful() +
            "\nTime elapsed: " + result.getRunTime() + "ms");
    }

}
