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

public class CustomerActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mbuttonc_timetableButton;
    private ImageView VIew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        //  TableLayout tableLayout= (TableLayout)findViewById(R.id.ac)
        Button c_timetableButton = (Button) findViewById(R.id.c_timetableButton);
        c_timetableButton.setOnClickListener(this);

        findViewById(R.id.monday2).setOnClickListener(this);
        findViewById(R.id.monday3).setOnClickListener(this);

        findViewById(R.id.wednesday2).setOnClickListener(this);
        findViewById(R.id.wednesday3).setOnClickListener(this);

        findViewById(R.id.friday2).setOnClickListener(this);
        findViewById(R.id.friday3).setOnClickListener(this);

        findViewById(R.id.tuesday5).setOnClickListener(this);
        findViewById(R.id.thursday5).setOnClickListener(this);
        findViewById(R.id.stherday5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.c_timetableButton:
                Intent intentc_timetableButton = new Intent(this, Customer2Activity.class);
                startActivity(intentc_timetableButton);
                break;

            case R.id.monday2:
                show();
                break;
            case R.id.monday3:
                show();
                break;
            case R.id.wednesday2:
                show();
                break;
            case R.id.wednesday3:
                show();
                break;
            case R.id.friday2:
                show();
                break;
            case R.id.friday3:
                show();
                break;
            case R.id.tuesday5:
                show();
                break;
            case R.id.thursday5:
                show();
                break;
            case R.id.stherday5:
                show();
                break;

        }
    }
    void show(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.trainer_memo, null);
        builder.setView(view);
        final Button save = (Button) view.findViewById(R.id.savebutton);
        final EditText memo = (EditText) view.findViewById(R.id.memoeditText);

        final AlertDialog dialog = builder.create();

        dialog.show(); //저장 버튼 눌렀을때 어떻게 할지는 아직
    }
}



