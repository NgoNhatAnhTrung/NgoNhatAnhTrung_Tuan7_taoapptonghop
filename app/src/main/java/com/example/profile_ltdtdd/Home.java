package com.example.profile_ltdtdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button btL,btPf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide(); //This line hides the acction bar
        setContentView(R.layout.activity_home);
        Anhxa();
        btPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Home.this, Profile.class);
                startActivity(intent2);
            }
        });
        btL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Home.this, show_list.class);
                startActivity(intent2);
            }
        });
    }
    private void Anhxa(){
        btL = (Button) findViewById(R.id.button2);
        btPf =(Button) findViewById(R.id.button);
    }

}