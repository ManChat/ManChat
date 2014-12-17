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
import android.widget.Toast;

import com.example.Activity.R;
import com.useFileInSD.*;

;
public class LogInActivity extends Activity {
	private TextView Register;
	private Button LogIn;
	private EditText UserAccountEd;
	private EditText PassWordEd;
	public String ID;// �û�ID
	public String PassWord;// �û�����

	boolean ifLogSuccess = true;// ��½�ɹ����

	SharedPreferences preference;
	SharedPreferences.Editor LogEditor;
	Bundle IdDate;

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
				ID = UserAccountEd.getText().toString();
				IdDate = new Bundle();
				IdDate.putSerializable("ID", ID);
				// ���ڵ�½������
				// ID = UserAccountEd.getText().toString();
				// PassWord = PassWordEd.getText().toString();
				// ifLogSuccess = Login(ID, PassWord);
				// �ж��Ƿ��½�ɹ����ɹ�����ת��ʧ���򱨴�
				if (ifLogSuccess) {
					Toast.makeText(LogInActivity.this, "���ߵ�½�ɹ�,ID:" + ID, 3000)
							.show();
					Intent intent = new Intent(LogInActivity.this,
							MenuActivity.class);
					intent.putExtras(IdDate);

					startActivity(intent);
				} else {
					Toast.makeText(LogInActivity.this, "��½ʧ�ܣ������˻��������Ƿ���ȷ",
							3000).show();

				}
			}
		});
		// ����ע�������
		Register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
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

	// ��½������������������ID��PassWord��������,��½�ɹ�����true��ʧ�ܷ���false
	//
	// public boolean Login(String ID, String PassWord) {
	//
	// }

}
