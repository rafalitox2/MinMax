
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class MinMaxTestCajaBlanca {
  @Test  
public void statementCoverage(){    
    MinMax minMax = new MinMax();
        int[] conjR = {1,3,4,1,1,6};
        int[] sol = {1,6};    
        assertArrayEquals(sol,minMax.minMax(conjR));
        int[] conjNulo = null;
        int[] solNula = null;  
        assertArrayEquals(solNula,minMax.minMax(conjNulo));
        int[] conjVacio = {};
        assertArrayEquals(solNula,minMax.minMax(conjVacio));    
  }

  @Test
  public void decisionCoverage() {
      int[] conjR = {1,3,4,1,1,6};
    int[] sol = { 1, 6 };
    assertArrayEquals(sol, MinMax.minMax(conjR));
    int[] conjNulo = null;
    int[] solNula = null;
    assertArrayEquals(solNula, MinMax.minMax(conjNulo));
    int[] conjVacio = {};
    assertArrayEquals(solNula, MinMax.minMax(conjVacio));
  }
  
  @Test
  public void conditionCoverage(){
    int[] conjR = {4,3,2,1};
        int[] sol = {1,4};
        assertArrayEquals(sol,MinMax.minMax(conjR));
        int[] conjNulo = null;
        int[] solNula = null;
        assertArrayEquals(solNula,MinMax.minMax(conjNulo));
        int[] conjVacio = {};     
        assertArrayEquals(solNula,MinMax.minMax(conjVacio));       
  }
  @Test
  public void decisionConditionCoverage(){

    MinMax minMax = new MinMax();
        int[] conjR = {1,1,6,2,3,4};
        int[] sol = {1,6};
        assertArrayEquals(sol,minMax.minMax(conjR));
        int[] conjNulo = null;
        int[] solNula = null;
        assertArrayEquals(solNula,minMax.minMax(conjNulo));
        int[] conjVacio = {};             
        assertArrayEquals(solNula,minMax.minMax(conjVacio));
        
  

}
}
