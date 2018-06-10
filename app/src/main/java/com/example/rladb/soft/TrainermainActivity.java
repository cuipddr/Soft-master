package com.example.rladb.soft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.app.AlertDialog;
import android.view.View.OnClickListener;

public class TrainermainActivity extends AppCompatActivity implements OnClickListener {

    private Button mbuttonTimetablebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainermain);

        Button timetablebutton = (Button) findViewById(R.id.t_timetableButton);
        timetablebutton.setOnClickListener(this);

        findViewById(R.id.monday4).setOnClickListener(this);
        findViewById(R.id.monday5).setOnClickListener(this);

        findViewById(R.id.wednesday4).setOnClickListener(this);
        findViewById(R.id.wednesday5).setOnClickListener(this);

        findViewById(R.id.friday4).setOnClickListener(this);
        findViewById(R.id.friday5).setOnClickListener(this);

        findViewById(R.id.tuesday7).setOnClickListener(this);
        findViewById(R.id.tuesday8).setOnClickListener(this);

        findViewById(R.id.thursday7).setOnClickListener(this);
        findViewById(R.id.thursday8).setOnClickListener(this);

        findViewById(R.id.stherday7).setOnClickListener(this);
        findViewById(R.id.stherday8).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.t_timetableButton:
                Intent intentTimetablebutton = new Intent(this, TrainerRegisterActivity.class);
                startActivity(intentTimetablebutton);
                break;
            case R.id.monday4:
                show1();
                break;
            case R.id.monday5:
                show1();
                break;
            case R.id.wednesday4:
                show1();
                break;
            case R.id.wednesday5:
                show1();
                break;
            case R.id. friday4:
                show1();
                break;
            case R.id. friday5:
                show1();
                break;

            case R.id.tuesday7:
                show1();
                break;
            case R.id.tuesday8:
                show1();
                break;
            case R.id.thursday7:
                show1();
                break;
            case R.id.thursday8:
                show1();
                break;
            case R.id. stherday7:
                show1();
                break;
            case R.id. stherday8:
                show1();
                break;

        }
    }

    void show1(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.customer_memo_01, null);
        builder.setView(view);
        final Button save = (Button) view.findViewById(R.id.savebutton);
        final EditText memo = (EditText) view.findViewById(R.id.memoeditText);

        final AlertDialog dialog = builder.create();

        dialog.show(); //저장 버튼 눌렀을때 어떻게 할지는 아직

    }


    void show2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.customer_memo_02, null);
        builder.setView(view);
        final Button save = (Button) view.findViewById(R.id.savebutton);
        final EditText memo = (EditText) view.findViewById(R.id.memoeditText);

        final AlertDialog dialog = builder.create();

        dialog.show(); //저장 버튼 눌렀을때 어떻게 할지는 아직

    }
}
