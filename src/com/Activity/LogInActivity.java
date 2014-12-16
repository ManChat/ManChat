package com.Activity;

import java.io.Serializable;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Activity.R;
import com.userBase.User;

public class LogInActivity extends Activity {
	private TextView Register;
	private Button LogIn;
	private EditText UserAccountEd;
	private EditText PassWordEd;
	private ImageView UserImg;

	public String ID;// 用户ID
	public String PassWord;// 用户密码

	// boolean ifLogSuccess;

	SharedPreferences preference;
	SharedPreferences.Editor LogEditor;

	/*
	 * private void initView() { Register = (TextView)
	 * findViewById(R.id.Register); }
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
		// 初始化View
		initView();
		// 设置登陆按钮监视器
		LogIn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// 用于登陆函数中
				// ID = UserAccountEd.getText().toString();
				// PassWord = PassWordEd.getText().toString();
				// ifLogSuccess = Login(ID, PassWord);
				Intent intent = new Intent();

				intent.setClass(LogInActivity.this, MenuActivity.class);
				startActivity(intent);
			}
		});
		// 设置注册监听器
		Register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// 判断是否登陆成功，成功则跳转，失败则报错
				// if(ifLogSuccess){}
				Intent intent = new Intent(LogInActivity.this,
						RegisterActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log_in, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void initView() {
		Register = (TextView) findViewById(R.id.Register);
		LogIn = (Button) findViewById(R.id.LogIn);
		UserAccountEd = (EditText) findViewById(R.id.UserAccount);
		PassWordEd = (EditText) findViewById(R.id.PassWord);
	}

	public void transmitToMenuActivity() {
		Bundle UserImgBun = new Bundle();
		Bundle ID = new Bundle();
		Drawable UserBit = UserImg.getDrawable();
		// 将用户头像和ID用Bundle发送到MenuActivity中
		UserImgBun.putSerializable("UserImg", (Serializable) UserBit);

	}
	// 登陆函数，传送两个变量ID和PassWord到服务器,登陆成功返回true，失败返回false
	/*
	 * public boolean Login(String ID, String PassWord){
	 * 
	 * }
	 */

}
