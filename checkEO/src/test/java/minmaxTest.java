import static org.junit.Assert.*;
import org.junit.Test;
public class minmaxTest {



        @Test
        public void case1(){
            minmax one = new minmax();
            int []A = {3,2,1,5,6,20,0};
            int []output = {0,20};
            assertArrayEquals( output , one.minmax(A));
        }
        @Test
        public void case2(){
            minmax two = new minmax();
            int []A = {1,2,5,0,7,9,-2}; //array
            int []output = {-2,9};
            assertArrayEquals(output,two.minmax(A) );
        }
        @Test
        public void case3() {
            minmax three = new minmax();
            int[] A = {33,2000,100,90,50}; //array
            int[] output = {33, 2000};
            assertArrayEquals(output, three.minmax(A));
        }


    }

