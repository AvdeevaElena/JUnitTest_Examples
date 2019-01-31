package numbers;

import com.sun.security.sasl.ntlm.FactoryImpl;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(MyMathTest.class,NumbersTest.class);
          for (Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
         }
        System.out.println(result.wasSuccessful());
        }

}
