package com.example.kated.afinal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivitySign extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        final EditText newLogin = (EditText)findViewById(R.id.new_login);
        final EditText newPassword = (EditText)findViewById(R.id.new_password);
        Button newBut = (Button)findViewById(R.id.new_log);

        newBut.setOnClickListener(new View.OnClickListener(){
            @Override
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v){
                final String newlog = newLogin.getText().toString();
                final String newpass = newPassword.getText().toString();
                Intent send = new Intent(ActivitySign.this, MainActivity.class);
                send.putExtra("log", newlog);
                send.putExtra("pass", newpass);
                startActivity(send);
            }
        });
    }
}
