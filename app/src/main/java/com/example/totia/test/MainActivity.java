package com.example.totia.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText,editText2,editText3,editText4,editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                String s= editText.getText().toString();
                String s2= editText2.getText().toString();
                String s3= editText3.getText().toString();
                String s4= editText4.getText().toString();
                String s5= editText5.getText().toString();
                Toast toast = Toast.makeText(context,s + "\n" + s2 + "\n" + s3 + "\n" +s4 + "\n "+s5 ,duration);
                toast.show();
            }
        });

    }

}
