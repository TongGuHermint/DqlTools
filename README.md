# DqlTools
:blush:贷齐乐Android小工具:blush:
## Download

Gradle:
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
```
```
dependencies {
	        compile 'com.github.TongGuHermint:DqlTools:v1.0.1'
	}
```

## How to use

```
// --------------------------------选择日期开始
mDqlDialogWheelYearMonthDay = new DqlDialogWheelYearMonthDay(this, 1994, 2017);
mDqlDialogWheelYearMonthDay.getSureView().setOnClickListener(
		new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (mDqlDialogWheelYearMonthDay.getCheckBoxDay().isChecked()) {
					btnDateDialog.setText(
						mDqlDialogWheelYearMonthDay.getSelectorYear() + "年"
							+ mDqlDialogWheelYearMonthDay.getSelectorMonth() + "月"
							+ mDqlDialogWheelYearMonthDay.getSelectorDay() + "日");
				} else {
					btnDateDialog.setText(
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
//--------------------------------选择日期结束

```
