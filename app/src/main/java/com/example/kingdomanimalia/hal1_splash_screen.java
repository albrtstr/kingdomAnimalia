package com.example.kingdomanimalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.kingdomanimalia.DbHelper.DbHelper;

public class hal1_splash_screen extends AppCompatActivity {
    private DbHelper dbHelper;
    int timee = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1_splash_screen);

        dbHelper = new DbHelper(this,"",null,1);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {

				int cek = dbHelper.getData();

				if (cek == 0) {
					startActivity(new Intent(hal1_splash_screen.this, hal2_login_screen.class));
					finish();
					this.selesai();
				}else{
					startActivity(new Intent(hal1_splash_screen.this, hal4_menu_screen.class));
					finish();
					this.selesai();
				}
			}

			private void selesai() {

			}
		}, timee);
    }
}