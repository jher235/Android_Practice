package com.chobo.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        et_test = findViewById(R.id.et_test);


        btn_move.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();

                Intent intent = new Intent(MainActivity.this , SubActivity2.class);
                intent.putExtra("str",str);
                startActivity(intent);//실질적으로 액티비티 이동해주는 구문

            }
        });

    }
}