import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinMaxTestCajaNegra {

	private MinMax MM;
	@Before
	public void setUp(){
		MM = new MinMax();
		
	}
	
	@Test
	public void TamNulo(){
		int a[] = null;
		assertEquals(null,MM.minMax(a));
	}
	@Test
	public void CasoBaseInt(){
		int a[]= new int [5];
		a[0]=1;
		a[1]=2;
		a[2]=6;
		a[3]=7;
		a[4]=12;
		int b[]= new int [2];
		b[0]=1;
		b[1]=12;
		assertEquals(b[0], MM.minMax(a)[0]);
		assertEquals(b[1],MM.minMax(a)[1]);
	}
	@Test
	public void Tam2(){
		int b[]= new int [3];
		b[0]=1;
		b[1]=12;
		b[2]=24;
		assertEquals(2, MM.minMax(b).length);
	}
}
