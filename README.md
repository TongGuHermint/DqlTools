# DqlTools
:underage:贷齐乐Android小工具:blush:
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
	        compile 'com.github.TongGuHermint:DqlTools:v1.0.2.1'
	}
```

## How to use
日期选择器
```
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
```
确定弹框
```
DqlDialogSure dqlDialogSure = new DqlDialogSure(MainActivity.this);
dqlDialogSure.getTitleView().setText("下载地址");
dqlDialogSure.getContentView().setText("https://www.baidu.com");
dqlDialogSure.getSureView().setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v) {
		dqlDialogSure.cancel();
	}
});
dqlDialogSure.show();

```
确定取消弹框
```
DqlDialogSureCancel dqlDialogSureCancel = new DqlDialogSureCancel(MainActivity.this);
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

```
等待弹框
```
DqlDialogLoading dqlDialogLoading = new DqlDialogLoading(MainActivity.this);
dqlDialogLoading.show();

```
## PS
:heartpulse:提示
```
目前只有日期选择器，确定弹框，确定取消弹框，等待弹框其他功能会逐步完善。

```
