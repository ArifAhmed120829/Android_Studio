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
        TextView textView = findViewById(R.id.text1);
        textView.setBackgroundColor(Color.GRAY);

        EditText edit1 = findViewById(R.id.edit1);



        edit1.setTextColor(Color.RED);







        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);

        b2.setText("Created by!");
        b2.setTextColor(Color.RED);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit1.getText().toString();
                Toast.makeText(getApplicationContext(),""+name,Toast.LENGTH_LONG).show();
            }
        });









    }

public void method1(View view) {
        Toast.makeText(getApplicationContext(),"Arif_Ahmed",Toast.LENGTH_SHORT).show();
}


}
