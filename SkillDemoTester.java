import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void test(){
        assertEquals("checks that 4 is correctly divided by 2", 2,
         SkillDemo.divide(4,2));

    }
    
}
