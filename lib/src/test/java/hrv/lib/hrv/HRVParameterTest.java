package hrv.lib.hrv;

import hrv.lib.hrv.calc.parameter.HRVParameter;
import hrv.lib.hrv.calc.parameter.HRVParameterEnum;
import org.junit.Test;

import static org.junit.Assert.*;

public class HRVParameterTest {

	@Test
	public void creationTests() {
		
		HRVParameter param1 = new HRVParameter();
		assertEquals(0.0, param1.getValue(), 0.000001);
		assertNull(param1.getUnit());
		
		param1.setUnit("ms");
		assertEquals("ms", param1.getUnit());
		param1.setValue(1.0);
		assertEquals(1.0, param1.getValue(), 0.000001);
		
		HRVParameter param2 = new HRVParameter(HRVParameterEnum.BAEVSKY, 2.0, "s");
		assertEquals(2.0, param2.getValue(), 0.000001);
		assertEquals("s", param2.getUnit());
		assertEquals("BAEVSKY", param2.getName());
	}
}
