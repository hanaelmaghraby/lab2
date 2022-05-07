import static org.junit.Assert.*;


import org.junit.Test;
public class EOTest {



        @Test
        public void case1(){
           EO one = new EO();
            assertEquals("number is even",one.EO(20));
        }

        @Test
        public void case2(){
            EO two = new EO();
            assertEquals("number is odd",two.EO(15));
        }

        @Test
        public void case3(){
            EO three = new EO();
            assertEquals("number is even",three.EO(-10));
        }

        @Test
        public void case4(){
            EO four = new EO();
            assertEquals("number is even",four.EO(0));
        }

    }

