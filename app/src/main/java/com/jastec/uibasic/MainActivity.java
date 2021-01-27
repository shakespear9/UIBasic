package com.jastec.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText editTxtName;
    private TextView txtHello;


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnHello :
//                Toast.makeText(this,"SecondText",Toast.LENGTH_LONG).show();
                Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello " + editTxtName.getText().toString());
                break;
            case R.id.editTextName :
                Toast.makeText(this, "Attempting to type something", Toast.LENGTH_SHORT).show();
            default :
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this); //MEMO : this line will go to onClick method at the top

        editTxtName = findViewById(R.id.editTextName);
        editTxtName.setOnClickListener(this);

        txtHello = findViewById(R.id.txtHello);



        
//        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Toast.makeText(MainActivity.this , "Long Press", Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });




//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Hello");
//            }
//        });
    }




//    public void onHelloBtnClicked(View view){
//        TextView txtWelcome = findViewById(R.id.txtWelcome);
//        txtWelcome.setText("Hello Youtube");
//
//    }

}