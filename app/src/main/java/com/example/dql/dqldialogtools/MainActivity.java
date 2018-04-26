package com.example.dql.dqldialogtools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dql.dqldialogtools.DqlTools.DqlDialogLoading;
import com.example.dql.dqldialogtools.DqlTools.DqlDialogSure;
import com.example.dql.dqldialogtools.DqlTools.DqlDialogSureCancel;
import com.example.dql.dqldialogtools.DqlTools.DqlDialogWheelYearMonthDay;

public class MainActivity extends AppCompatActivity {
	private DqlDialogWheelYearMonthDay mDqlDialogWheelYearMonthDay;
	private Button button;
	private Button button1;
	private Button button2;
	private Button button3;
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
		button1 = (Button)findViewById(R.id.btn1);
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				initSureCancleDialog();

			}
		});
		button2 = (Button)findViewById(R.id.btn2);
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				initSureDialog();
			}
		});
		button3 = (Button)findViewById(R.id.btn3);
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				initLoadingDialog();
			}
		});
	}

	private void initLoadingDialog() {
		DqlDialogLoading dqlDialogLoading = new DqlDialogLoading(MainActivity.this);
		dqlDialogLoading.show();
	}

	private void initSureDialog() {
		final DqlDialogSure dqlDialogSure = new DqlDialogSure(MainActivity.this);//提示弹窗
//		rxDialogSure.getLogoView().setImageResource(R.drawable.logo);
		dqlDialogSure.getTitleView().setText("下载地址");
		dqlDialogSure.getContentView().setText("https://www.baidu.com");
		dqlDialogSure.getSureView().setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dqlDialogSure.cancel();
			}
		});
		dqlDialogSure.show();
	}


	private void initSureCancleDialog() {
		final DqlDialogSureCancel dqlDialogSureCancel = new DqlDialogSureCancel(MainActivity.this);
//				dqlDialogSureCancel.getTitleView().setBackgroundResource(R.drawable.logo);
		dqlDialogSureCancel.getTitleView().setVisibility(View.GONE);
		dqlDialogSureCancel.getContentView().setText("退出登陆");
		dqlDialogSureCancel.getSureView().setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dqlDialogSureCancel.cancel();
			}
		});
		dqlDialogSureCancel.getCancelView().setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				dqlDialogSureCancel.cancel();
			}
		});
		dqlDialogSureCancel.show();
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
