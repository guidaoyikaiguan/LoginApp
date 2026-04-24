package com.app.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView tvUser;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvUser = findViewById(R.id.tv_user);
        btnLogout = findViewById(R.id.btn_logout);

        tvUser.setText("当前登录：张三");

        btnLogout.setOnClickListener(v -> {
            finish();
        });
    }
}