package com.chobo.listexample01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = findViewById(R.id.list);

        List<String> data = new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data); //리스트와 데이터의 중간다리 역할
        lv.setAdapter(adapter);

        data.add("jher");
        data.add("java");
        data.add("android");
        data.add("ios");
        adapter.notifyDataSetChanged();//현재 데이터 상태를 저장함.

    }
}