package data;

import gueei.binding.Converter;
import gueei.binding.IObservable;

import java.math.BigDecimal;

import android.util.Log;

public class BigDecimalConverter extends Converter<String> {

	public BigDecimalConverter(IObservable[] args) {
		super(String.class, args);
	}

	@Override
	public boolean ConvertBack(Object value, Object[] outResult) {
		Log.d("ERROR", (String) value);
		outResult[0] = new BigDecimal(value.toString());
		return true;
	}

	@Override
	public String calculateValue(Object... arg0) throws Exception {
		if (arg0.length != 1) {
			return "";
		}
		return String.format("%3.2f", (BigDecimal) arg0[0]);
	}
}
