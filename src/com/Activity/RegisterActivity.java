package com.Activity;

import org.w3c.dom.Text;

import com.example.Activity.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends Activity {
	private Button BackToLog = null;
	private TextView RegisterUserID;// ע��ID
	private TextView RegisterPassWord;// ע������
	private TextView ConfirmPassWord;// ȷ�������Ƿ���ȷ
	private TextView RegisterUserPostcode;// ע���ʱ���Ϣ
	private TextView RegisterUserAddress;// ע���ַ��Ϣ

	private String UserID;
	private String Password;
	private String PostCode;
	private String Add;

	// ��ʼ�������ĺ���
	private void initdate() {
		UserID = RegisterUserID.getText().toString();

	}

	// ��ʼ��View�ĺ���
	private void initView() {
		RegisterUserID = (TextView) findViewById(R.id.RegisterUserID);
		RegisterPassWord = (TextView) findViewById(R.id.RegisterPassWord);
		ConfirmPassWord = (TextView) findViewById(R.id.ConfirmPassWord);
		RegisterUserPostcode = (TextView) findViewById(R.id.RegisterUserPostcode);
		RegisterUserAddress = (TextView) findViewById(R.id.RegisterUserAddress);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		initView();
		initdate();

		BackToLog = (Button) findViewById(R.id.BackToLog);
		// ��ʱ�Ĳ��Լ�����
		BackToLog.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();

				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
}
