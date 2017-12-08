import static org.junit.Assert.*;

import java.util.EnumSet;
import java.util.LinkedHashSet;

import org.junit.Test;

public class SwagTest2 {

	@Test
	public void testCross() {
		assertEquals("m+i+a+g+e", Swag.swag("miage", EnumSet.of(Swag.STYLE.CROSS)));
	}
	
	@Test
	public void testKikoo() {
		assertEquals("MiAgE", Swag.swag("miage", EnumSet.of(Swag.STYLE.KIKOU)));
	}
	
	@Test
	public void testCombo() {
		LinkedHashSet<Swag.STYLE> hs = new LinkedHashSet<Swag.STYLE>();
		hs.add(Swag.STYLE.KIKOU);
		hs.add(Swag.STYLE.CROSS);
		assertEquals("M+i+A+g+E", Swag.swag("miage", hs));
	}

}
