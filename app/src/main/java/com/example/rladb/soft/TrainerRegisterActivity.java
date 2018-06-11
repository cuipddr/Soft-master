package com.example.rladb.soft;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import static android.widget.Toast.*;


public class TrainerRegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbuttont_DeleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_register);

        Button t_Plusbutton = (Button) findViewById(R.id.t_PlusButton);
        t_Plusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });

        Button t_DeleteButton = (Button) findViewById(R.id.t_DeleteButton);
        t_DeleteButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.t_DeleteButton:
                    Intent intentt_DeleteButton = new Intent(this, TrainerRollbackActivity.class);
                    startActivity(intentt_DeleteButton);
                    break;
            }
    }


    void show()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("등록 하겠습니까?");
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), " 등록 되었습니다.", Toast.LENGTH_LONG).show();
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"취소 하셨습니다.", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();

    }

}
