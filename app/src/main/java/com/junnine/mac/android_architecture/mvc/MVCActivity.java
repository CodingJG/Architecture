package com.junnine.mac.android_architecture.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.junnine.mac.android_architecture.Model.Item;
import com.junnine.mac.android_architecture.R;

public class MVCActivity extends AppCompatActivity {


    Item item;

    TextView textName,textCount,textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        textName = (TextView)findViewById(R.id.text_name);
        textCount = (TextView)findViewById(R.id.text_count);
        textInfo = (TextView)findViewById(R.id.text_info);

        item = new Item("Box1",1,"MVC Box");

        textName.setText(item.getName());
        textCount.setText(String.valueOf(item.getCount()));
        textInfo.setText(item.getInfo());
    }
}
