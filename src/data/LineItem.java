package data;

import gueei.binding.cursor.RowModel;
import gueei.binding.observables.BooleanObservable;
import gueei.binding.observables.FloatObservable;
import gueei.binding.observables.StringObservable;

import java.math.BigDecimal;

public class LineItem extends RowModel {
	public final StringObservable ItemName = new StringObservable("");
	public final BigDecimalObservable ItemCost = new BigDecimalObservable(BigDecimal.valueOf(10.0d));
	public final BooleanObservable ItemSelected = new BooleanObservable(false);
}
