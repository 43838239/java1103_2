
package ocp16;

import com.ocp16_exception.Power;
import org.junit.Test;


public class Test_Power {
@Test
public void  test(){
    Power power = new Power();
    int w = 1000;
    int a = 100;
    int exp = 10;
    int act = power.gatV(w, a);
    Assert.assertEquals(exp, act);
}  
@Test
public void  test2() {
    Power power = new Power();
            
}
}
