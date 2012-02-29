package data;

import gueei.binding.Command;
import gueei.binding.Observable;
import gueei.binding.collections.ArrayListObservable;
import gueei.binding.observables.FloatObservable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import android.util.Log;
import android.view.View;

public class Bucket {
	final ArrayListObservable<LineItem> ItemList;

	List<LineItem> items = new ArrayList<LineItem>();

	public BigDecimalObservable total = new BigDecimalObservable(BigDecimal.valueOf(0.0d));
	public BigDecimalObservable tip = new BigDecimalObservable(BigDecimal.valueOf(0.0d));

	public Bucket(ArrayListObservable<LineItem> ItemList) {
		this.ItemList = ItemList;
	}

	public void add(LineItem item) {
		items.add(item);
	}

	public final Command Click = new Command() {
		public void Invoke(View view, Object... args) {
			items.clear();
			Log.d("TEST", "CLICK!");
			for (LineItem item : ItemList) {
				if (item.ItemSelected.get() && !items.contains(item)) {
					items.add(item);
					item.ItemSelected.set(false);
				}
			}
			total.set(BigDecimal.valueOf(123d));
			tip.set(BigDecimal.valueOf(0d));
			for (LineItem item : items) {
				Log.d("ASDF", item.ItemName.get());
				total.set(total.get().add(item.ItemCost.get()));
			}
			tip.set(total.get().multiply(BigDecimal.valueOf(0.15d)));
			
		}
	};

}
