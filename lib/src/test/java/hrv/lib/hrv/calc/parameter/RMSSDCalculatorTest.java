package hrv.lib.hrv.calc.parameter;

import hrv.lib.hrv.RRData;
import hrv.lib.units.TimeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class RMSSDCalculatorTest {

	@Test
	public void testCalculation() {
		double[] valueData = new double[] { 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 };
		RRData data = new RRData(null, TimeUnit.SECOND, valueData, TimeUnit.SECOND);
		
		RMSSDCalculator calc = new RMSSDCalculator();
		assertEquals(1.0, calc.process(data).getValue(), 0.00001);
	}
}
