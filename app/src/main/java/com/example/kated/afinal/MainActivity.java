package com.example.kated.afinal;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = (EditText)findViewById(R.id.login);
        final EditText password = (EditText)findViewById(R.id.password);
        final TextView txt = (TextView)findViewById(R.id.ver);
        Button but = (Button)findViewById(R.id.log);

        but.setOnClickListener(new View.OnClickListener(){
            @Override
            @RequiresApi(api = Build.VERSION_CODES.M)
            public void onClick(View v){
                final String log = login.getText().toString();
                final String pass = password.getText().toString();
                final String l = "student";
                final String p = "class";
                if(l.equals(log) && p.equals(pass)){
                    txt.setText("Верно");
                    txt.setTextColor(getResources().getColor(R.color.correct, getResources().newTheme()));
                }else {
                    Intent i = new Intent(MainActivity.this, ActivitySign.class);
                    startActivity(i);


                }
            }
        });
        login.setText(getIntent().getStringExtra("log"));
        password.setText(getIntent().getStringExtra("pass"));
    }

}
