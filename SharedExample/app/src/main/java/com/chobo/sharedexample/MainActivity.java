package com.chobo.sharedexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_s;
    String shared = "file";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_s = findViewById(R.id.et_save);

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String pre_value = sharedPreferences.getString("jher","");
        et_s.setText(pre_value);



    }

    @Override
    protected void onDestroy() {//액티비티가 파괴될 때 호출 됨.
        super.onDestroy();

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_s.getText().toString();
        editor.putString("jher",value);//"jher에다가 value 저장
        editor.commit();

    }



}