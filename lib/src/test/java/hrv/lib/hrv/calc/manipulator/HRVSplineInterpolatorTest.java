package hrv.lib.hrv.calc.manipulator;

import hrv.lib.hrv.RRData;
import hrv.lib.units.TimeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class HRVSplineInterpolatorTest {

    @Test(expected=IllegalArgumentException.class)
    public void testTooShortData() {

        RRData data = RRData.createFromRRInterval(new double[]{1.0, 0.9}, TimeUnit.SECOND);

        HRVSplineInterpolator interpolator = new HRVSplineInterpolator(4);

        interpolator.manipulate(data);
    }
}
