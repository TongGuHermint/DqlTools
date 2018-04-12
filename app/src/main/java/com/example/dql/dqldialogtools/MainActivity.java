package com.example.dql.dqldialogtools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dql.dqldialogtools.DqlTools.DqlDialogWheelYearMonthDay;

public class MainActivity extends AppCompatActivity {
	private DqlDialogWheelYearMonthDay mDqlDialogWheelYearMonthDay;
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button)findViewById(R.id.btn);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (mDqlDialogWheelYearMonthDay == null) {
					initWheelYearMonthDayDialog();
				}
				mDqlDialogWheelYearMonthDay.show();
			}
		});

	}


	private void initWheelYearMonthDayDialog() {
		// ------------------------------------------------------------------选择日期开始
		mDqlDialogWheelYearMonthDay = new DqlDialogWheelYearMonthDay(this, 1994, 2017);
		mDqlDialogWheelYearMonthDay.getSureView().setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						if (mDqlDialogWheelYearMonthDay.getCheckBoxDay().isChecked()) {
							button.setText(
									mDqlDialogWheelYearMonthDay.getSelectorYear() + "年"
											+ mDqlDialogWheelYearMonthDay.getSelectorMonth() + "月"
											+ mDqlDialogWheelYearMonthDay.getSelectorDay() + "日");
						} else {
							button.setText(
									mDqlDialogWheelYearMonthDay.getSelectorYear() + "年"
											+ mDqlDialogWheelYearMonthDay.getSelectorMonth() + "月");
						}
						mDqlDialogWheelYearMonthDay.cancel();
					}
				});
		mDqlDialogWheelYearMonthDay.getCancleView().setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						mDqlDialogWheelYearMonthDay.cancel();
					}
				});
		// ------------------------------------------------------------------选择日期结束
	}
}
