package com.useFileInSD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Environment;

public class UseFileInSD {

	public String FILE_ROOT = "/ManChat";
	public String FILE_UserHeadImg = "/UserHeadImg";

	// 判断是否含有SD卡
	// 插入注释测试Git
	public boolean ifHasSD() {
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED))
			return true;
		else
			return false;
	}

	// 向SD卡中存入用户的头像，传入参数位Drawable和FileName
	public void saveUserHeadImg(Drawable UserHeadImg, String FileName)
			throws Exception {
		File file = new File(FILE_ROOT + FILE_UserHeadImg, FileName);
		FileOutputStream fos = null;
		BitmapDrawable bd = (BitmapDrawable) UserHeadImg;
		Bitmap bitmap = bd.getBitmap();
		try {
			fos = new FileOutputStream(file);
			if (null != fos) {
				bitmap.compress(Bitmap.CompressFormat.PNG, 90, fos);
				fos.flush();
				fos.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
