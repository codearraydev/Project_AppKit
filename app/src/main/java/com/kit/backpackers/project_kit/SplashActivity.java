package com.kit.backpackers.project_kit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kit.backpackers.project_kit.SessionManagment.UserLoginSession;

import java.util.HashMap;

public class SplashActivity extends AppCompatActivity {

    UserLoginSession userLoginSession;
    String _username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        HashMap<String, String > userDetails = userLoginSession.getUserDetails();
        _username = userDetails.get(UserLoginSession.username);
    }

    public void sendMessage(View view) {
        if(_username != null){
            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
            finish();
        }else {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }
    }
}
