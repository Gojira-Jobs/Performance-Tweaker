package com.phantomLord.cpufrequtils.app.adapters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.asksven.android.common.kernelutils.AlarmsDumpsys;
import com.asksven.android.common.privateapiproxies.StatElement;
import com.phantomLord.cpufrequtils.app.R;
import com.phantomLord.cpufrequtils.app.utils.MiscUtils;

public class AlarmTriggerAdapter extends BaseAdapter {
	ArrayList<StatElement> alarms;
	Context context;

	public AlarmTriggerAdapter(Context ctx) {
		this.context = ctx;
		alarms = AlarmsDumpsys.getAlarms();
		alarms = MiscUtils.removeZeroValues(alarms);
		Collections.sort(alarms, new Comparator<StatElement>() {
			@Override
			public int compare(StatElement arg0, StatElement arg1) {
				double a[] = arg0.getValues();
				double b[] = arg1.getValues();
				return (int) (b[0] - a[0]);
			}
		});
	}

	@Override
	public View getView(int position, View arg1, ViewGroup container) {
		LayoutInflater infalter = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View row = infalter.inflate(R.layout.alarm_trigger_custom_list_item1,
				container, false);
		TextView AlarmPackageName = (TextView) row
				.findViewById(R.id.alarm_package_name);
		TextView WakeupCount = (TextView) row.findViewById(R.id.wakeup_count);

		// Alarm alarmItem = (Alarm) alarms.get(position);
		AlarmPackageName.setText(alarms.get(position).getPackageName());
		WakeupCount.setText(alarms.get(position).getData());
		return row;
	}

	@Override
	public int getCount() {
		return alarms.size();
	}

	@Override
	public Object getItem(int arg0) {
		return alarms.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return alarms.indexOf(arg0);
	}

}
