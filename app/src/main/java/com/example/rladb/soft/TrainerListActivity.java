package com.example.rladb.soft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class TrainerListActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_list);

        findViewById(R.id.t_profile_01_img).setOnClickListener(this);
        findViewById(R.id.t_profile_02_img).setOnClickListener(this);
        findViewById(R.id.t_profile_03_img).setOnClickListener(this);
        findViewById(R.id.t_profile_04_img).setOnClickListener(this);
        findViewById(R.id.t_profile_06_img).setOnClickListener(this);
        findViewById(R.id.t_profile_05_img).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.t_profile_01_img:
                Intent intent_profile_01_img = new Intent(this, TrainerProfileActivity.class);
                startActivity(intent_profile_01_img);
                break;
            case R.id.t_profile_02_img:
                Intent intent_profile_02_img = new Intent(this, TrainerProfileActivity2.class);
                startActivity(intent_profile_02_img);
                break;
            case R.id.t_profile_03_img:
                Intent intent_profile_03_img = new Intent(this, TrainerProfileActivity3.class);
                startActivity(intent_profile_03_img);
                break;
            case R.id.t_profile_04_img:
                Intent intent_profile_04_img = new Intent(this, TrainerProfileActivity4.class);
                startActivity(intent_profile_04_img);
                break;
            case R.id.t_profile_05_img:
                Intent intent_profile_05_img = new Intent(this, TrainerProfileActivity5.class);
                startActivity(intent_profile_05_img);
                break;
            case R.id.t_profile_06_img:
                Intent intent_profile_06_img = new Intent(this, TrainerProfileActivity6.class);
                startActivity(intent_profile_06_img);
                break;
        }

    }
}
