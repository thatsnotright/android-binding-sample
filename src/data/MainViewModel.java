package data;

import gueei.binding.Command;
import gueei.binding.collections.ArrayListObservable;

import java.math.BigDecimal;

import android.util.Log;

public class MainViewModel {
	final public ArrayListObservable<LineItem> ItemList = 
        new ArrayListObservable<LineItem>(LineItem.class);
	
	final public ArrayListObservable<Bucket> BucketList = new ArrayListObservable<Bucket>(Bucket.class);	
	
	public final Command AddItem = new Command() {
		@Override
		public void Invoke(android.view.View arg0, Object... arg1) {
			LineItem i = new LineItem();
			/*i.cost.set(BigDecimal.valueOf(10d));
			i.item.set("bopasdfb");*/
			Log.d("YAY","22YAY");
			ItemList.add(i);
		};
	};
	
	public final Command AddBucket = new Command() {
		@Override
		public void Invoke(android.view.View arg0, Object... arg1) {
			Bucket bucket = new Bucket(ItemList);
			BucketList.add(bucket);
		};
	};

}
