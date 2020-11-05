package tekCift;

import static org.junit.Assert.*;

import org.junit.Test;

public class tekCiftTest {

	tekCiftKontrol testInstance = new tekCiftKontrol();
	
	@Test
	public void trueKontrol() {
		
		int sayi = 10;
		String expect = "Sayi cifttir.";
		String actual = testInstance.tekOrCift(sayi);
		assertEquals(expect,actual);	
	}
	
	public void falseKontrol() {
		
		int sayi = 9;
		String expect = "Sayi tekdir.";
		String actual = testInstance.tekOrCift(sayi);
		assertEquals(expect,actual);
		
	}
	

}
