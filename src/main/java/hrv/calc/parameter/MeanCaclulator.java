package hrv.calc.parameter;

import org.apache.commons.math3.stat.descriptive.moment.Mean;

import hrv.RRData;

public class MeanCaclulator implements HRVDataProcessor {

	@Override
	public HRVParameter process(RRData data) {
		Mean m = new Mean();
		return new HRVParameter("Mean RR", m.evaluate(data.getValueAxis()), data.getValueAxisUnit().toString());
	}

}
