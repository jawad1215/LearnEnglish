package com.example.learnenglish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<English> englishes=new ArrayList<>();
        englishes.add(new English("A","Apple",R.mipmap.apple));
        englishes.add(new English("B","Banana",R.mipmap.banana));
        englishes.add(new English("C","Cat",R.mipmap.cat));
        englishes.add(new English("D","Dog",R.mipmap.dog));
        englishes.add(new English("E","Elephant",R.mipmap.elephant));

        EnglishAdapter englishAdapter=new EnglishAdapter(this,englishes);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(englishAdapter);




    }
}
