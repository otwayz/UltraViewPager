package com.tmall.ultraviewpager.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class ViewPagerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_pager);
		ViewPager viewPager = findViewById(R.id.id_view_pager);
		viewPager.setAdapter(new UltraPagerAdapter(false));
		viewPager.setPageMargin(50);
		viewPager.setOffscreenPageLimit(3);
		viewPager.setPageTransformer(false, new CustPagerTransformer());
	}
}
