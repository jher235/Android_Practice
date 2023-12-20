package com.chobo.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;//임포트가 안되서 빨강색으로 오류가 발생할 경우 빨강색에 커서를 올리고 alt+enter
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;//변수선언
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // R은 resource, res파일임. R.layout은 res파일의 layout파일을 의미.


        et_id = findViewById(R.id.et_id); // findViewById는 특정한 아이디를 이 변수에 속성을 부여하는 것. R은 리소스 임
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() { //버튼 클릭시 action 줌.
            @Override
            public void onClick(View v) {
                et_id.setText("jher");
            }
        });


    }
}