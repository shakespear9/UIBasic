package com.jastec.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private CheckBox chkBoxHarry, chkBoxMatrix, chkBoxGodzilla;
    private RadioGroup rgMaritalStatus;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        chkBoxHarry = findViewById(R.id.checkBoxHarry);
        chkBoxMatrix = findViewById(R.id.checkBoxMatrix);
        chkBoxGodzilla = findViewById(R.id.checkBoxGodzilla);

        rgMaritalStatus = findViewById(R.id.rgMaritalStatus);

        progressBar = findViewById(R.id.progressBar);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<10 ; i++){
                    progressBar.incrementProgressBy(10);
                    SystemClock.sleep(500);

                }
            }
        });
        thread.start();

        int progress = progressBar.getProgress();

        int checkedButton  = rgMaritalStatus.getCheckedRadioButtonId(); // MEMO : get id of checked Radio Button

        switch(checkedButton){
            case R.id.rbMarried:
                Toast.makeText(MainActivity2.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle :
                Toast.makeText(MainActivity2.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel :
                Toast.makeText(MainActivity2.this, "In Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch  (checkedId) {
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity2.this, "Married", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle :
                        Toast.makeText(MainActivity2.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel :
                        Toast.makeText(MainActivity2.this, "In Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });



        if( chkBoxHarry.isChecked())
            Toast.makeText(this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity2.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();


        chkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    Toast.makeText(MainActivity2.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity2.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
            }
        });




    }
}