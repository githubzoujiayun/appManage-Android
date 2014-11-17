package com.bobx.appmanage.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

public abstract class PullToRefreshBase<T extends View> extends LinearLayout implements IPullToRefresh<T> {
		

	public PullToRefreshBase(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean demo() {
		// TODO Auto-generated method stub
		return false;
	}

}
