import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method1() {
        Demo d = new Demo();
        d.DoSomething(true);
        
    }

    @Test
    public void testmethod2() {
         System.out.println("--------------------running test------>>");
    }
}
