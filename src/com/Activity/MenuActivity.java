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
	public ImageButton ReceiveMail;
	public ImageButton WritingMail;
	public ImageButton WritingCard;
	public ImageButton WritingWishingCrad;
	public ImageButton SettingMenu;

	private Drawable UserImgDraw;
	private boolean ifHasSD;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		intiView();
		Intent intent = getIntent();
		String ID = (String) intent.getSerializableExtra("ID");
		UserImgDraw = getUserImg(ID);
		UserName.setText(getString(R.string.HelloSir)+ID);
		ifHasSD = UseFileInSD.ifHasSD();
		try {
			UseFileInSD.saveUserHeadImg(UserImgDraw,ID+"headImg");
		} catch (Exception e) {
			Toast.makeText(MenuActivity.this, "SD�������ڣ������û�ͷ��ʧ��", 3000);
			e.printStackTrace();
		}
	}

	// ��ʼ��View
	private void intiView() {
		UserImg = (ImageView) findViewById(R.id.UserImg);
		UserName = (TextView) findViewById(R.id.UserName);
		ReceiveMail = (ImageButton) findViewById(R.id.receive_mail);
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
