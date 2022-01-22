package com.example.myapplication199;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //wIDGETS

        TextView textView = findViewById(R.id.text1);
        textView.setBackgroundColor(Color.GRAY);

        EditText edit1 = findViewById(R.id.edit1);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);






        edit1.setTextColor(Color.RED);







        Button b1 = findViewById(R.id.button);





        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //1-Get the kilogram value from edittext

                //2-Convert the kilograms to pounds
                String kilograms = edit1.getText().toString();
                //3- Converting the String into float
                float kilos = Float.parseFloat(kilograms);
                float pounds = (float)(kilos * 2.20462);
                //4- set the Textview with the result_ Displaying result
                //Toast.makeText(getApplicationContext(),""+name,Toast.LENGTH_LONG).show();
                textView2.setText(""+pounds);
            }
        });









    }




}
