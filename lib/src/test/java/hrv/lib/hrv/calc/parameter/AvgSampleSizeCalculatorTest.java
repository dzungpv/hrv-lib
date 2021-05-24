package hrv.lib.hrv.calc.parameter;

import hrv.lib.hrv.RRData;
import hrv.lib.units.TimeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class AvgSampleSizeCalculatorTest {

	@Test
	public void testSampleSizeCalculation() {
		
		double[] timeData1 = new double[] { 1.0, 2.0, 3.0, 4.0 };
		double[] timeData2 = new double[] { 0.0, 2.0, 2.5, 4.0 };
		double[] timeData3 = new double[] { 1.0, 2.5, 3.5, 20.0 };

		AvgSampleSizeCalculator calc = new AvgSampleSizeCalculator();
		
		RRData data1 = new RRData(timeData1, TimeUnit.SECOND, null, TimeUnit.SECOND);
		assertEquals(1.0, calc.process(data1).getValue(), 0.00001);

		RRData data2 = new RRData(timeData2, TimeUnit.SECOND, null, TimeUnit.SECOND);
		assertEquals(4 / 3.0, calc.process(data2).getValue(), 0.00001);		

		RRData data3 = new RRData(timeData3, TimeUnit.SECOND, null, TimeUnit.SECOND);
		assertEquals(19.0 / 3, calc.process(data3).getValue(), 0.00001);
	}
}
