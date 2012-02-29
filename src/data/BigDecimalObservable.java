package data;

import java.math.BigDecimal;

import gueei.binding.Converter;
import gueei.binding.IObservable;
import gueei.binding.Observable;

public class BigDecimalObservable extends Observable<BigDecimal> {
	
	
	public BigDecimalObservable(BigDecimal value) {
		super(BigDecimal.class, value);
	}
	
}