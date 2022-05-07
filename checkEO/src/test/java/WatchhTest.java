import static org.junit.Assert.*;
import org.junit.Test;
public class WatchhTest {




        @Test
        public void case1(){
            Watchh first= new Watchh();
            String inputs = "zyzdzxzzd";
            String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 00:00";
            assertEquals( output , first.watch(inputs));
        }




        @Test
        public void case2(){
            Watchh second = new Watchh();
            String inputs = "xyyzyyyzzzz";
            String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 03:02";
            assertEquals( output , second.watch(inputs));
        }


}