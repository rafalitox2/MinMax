

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCiclomatica {

  @Test
  public void FallaPrimeraCondicionArrayNulo() { //PRIMER CAMIN0
    int []xs = null;
    int [] res=null;
    assertArrayEquals(xs, MinMax.minMax(res));
    
  }

  @Test
  public void FallaPrimeraCondicionArrayVacio() {       //PRIMER CAMINO  
    int []xs = new int [0];
    int []res= null;
    assertArrayEquals(null, MinMax.minMax(res));
    
  }
  
  @Test
  public void FallaSegundaCondicion (){  
    int []xs = new int [2];
    xs[0]= 1;
    xs[1]= 1;  
    int []res ={1,1};
    assertArrayEquals(xs, MinMax.minMax(res));
  }  
  
  @Test
  public void SeCumpleSegundaCondicion (){ 
    int []xs={1,2};
    int []res ={1,2};
    assertArrayEquals(xs, MinMax.minMax(res));
  }
  
  @Test
  public void SeCumpleTerceraCondicion()  {  
    int []xs={1,3};
    int []res ={3,1};
    assertArrayEquals(xs, MinMax.minMax(res));
  }
  
}