package com.Activity;

import com.example.Activity.R;
import com.example.Activity.R.string;
import com.userBase.User;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;
import com.useFileInSD.*;

public class MenuActivity extends Activity {
	public ImageView UserImg;
	public TextView UserName;
	public ImageButton MyMailBox;
	public ImageButton WritingMail;
	public ImageButton WritingCard;
	public ImageButton WritingWishingCrad;
	public ImageButton SettingMenu;

	private Drawable UserImgDraw;
	private boolean ifHasSD;

	private UseFileInSD fileInSD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		intiView();
		Intent intent = getIntent();
		String ID = (String) intent.getSerializableExtra("ID");
		UserImgDraw = getUserImg(ID);
		UserName.setText(getString(R.string.HelloSir) + ID);
		fileInSD = new UseFileInSD();
		ifHasSD = fileInSD.ifHasSD();
		try {
			fileInSD.saveUserHeadImg(UserImgDraw, ID + "headImg");
		} catch (Exception e) {
			e.printStackTrace();
		}
		WritingMail.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this,
						SendMailActivity.class);
				startActivity(intent);
			}
		});

		MyMailBox.setOnClickListener(new OnClickListener() {

			@Overridess
			public void onClick(View v) {
				Intent intent = new Intent(MenuActivity.this,
						MailBoxActivity.class);
				startActivity(intent);
			}
		});

	}

	// ��ʼ��View
	private void intiView() {
		UserImg = (ImageView) findViewById(R.id.UserImg);
		UserName = (TextView) findViewById(R.id.UserName);
		MyMailBox = (ImageButton) findViewById(R.id.my_mail_box);
		WritingMail = (ImageButton) findViewById(R.id.writing_mail);
		WritingCard = (ImageButton) findViewById(R.id.writing_card);
		WritingWishingCrad = (ImageButton) findViewById(R.id.writing_wishingcard);
		SettingMenu = (ImageButton) findViewById(R.id.setting_menu);

	}

	// �����û�ͷ����
	public Drawable getUserImg(String ID) {
		// 1.�ӷ����������ص���d��½ID��Ӧ��Bitmap
		// 2.��Bitmapת��ΪDrawable����
		Drawable UserImg = null;
		return UserImg;
	}
}
