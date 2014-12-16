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

	public String ID;// �û�ID
	public String PassWord;// �û�����

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
		// ��ʼ��View
		initView();
		// ���õ�½��ť������
		LogIn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// ���ڵ�½������
				// ID = UserAccountEd.getText().toString();
				// PassWord = PassWordEd.getText().toString();
				// ifLogSuccess = Login(ID, PassWord);
				Intent intent = new Intent();

				intent.setClass(LogInActivity.this, MenuActivity.class);
				startActivity(intent);
			}
		});
		// ����ע�������
		Register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// �ж��Ƿ��½�ɹ����ɹ�����ת��ʧ���򱨴�
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
		// ���û�ͷ���ID��Bundle���͵�MenuActivity��
		UserImgBun.putSerializable("UserImg", (Serializable) UserBit);

	}
	// ��½������������������ID��PassWord��������,��½�ɹ�����true��ʧ�ܷ���false
	/*
	 * public boolean Login(String ID, String PassWord){
	 * 
	 * }
	 */

}
