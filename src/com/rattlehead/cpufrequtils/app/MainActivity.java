package com.rattlehead.cpufrequtils.app;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.rattlehead.cpufrequtils.app.dialogs.RootAlertDialog;
import com.rattlehead.cpufrequtils.app.utils.Constants;
import com.rattlehead.cpufrequtils.app.utils.RootUtils;
import com.viewpagerindicator.PageIndicator;
import com.viewpagerindicator.TitlePageIndicator;

public class MainActivity extends SherlockFragmentActivity {
	

	TestFragmentAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.title_tabs);
        
        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());
        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (TitlePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        
        if(!(RootUtils.isRooted())) {
        	new RootAlertDialog().show(getSupportFragmentManager(), Constants.tag);
        }
    }
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	//	menu.add("hi").setIcon(R.drawable.ic_menu_moreoverflow_normal_holo_dark)
		//.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		getSupportMenuInflater().inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
		
		
	}
	
}