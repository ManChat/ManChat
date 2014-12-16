package com.example.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends Activity {
	private TextView Register;
	private Button   LogIn;

	/*private void initView() {
		Register = (TextView) findViewById(R.id.Register);
	}
*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
		Register = (TextView) findViewById(R.id.Register);
		LogIn    = (Button) findViewById(R.id.LogIn);
		// ÉèÖÃµÇÂ½°´Å¥¼àÊÓÆ÷
		LogIn.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent();
				intent.setClass(LogInActivity.this, MenuActivity.class);
				startActivity(intent);
			}
		});
		// ÉèÖÃ×¢²á¼àÌýÆ÷
		Register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
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
}
