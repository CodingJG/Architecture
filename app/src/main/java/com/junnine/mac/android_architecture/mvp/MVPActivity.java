package com.junnine.mac.android_architecture.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.junnine.mac.android_architecture.Model.Item;
import com.junnine.mac.android_architecture.R;

public class MVPActivity extends AppCompatActivity implements MVPContract.View{

    private MVPContract.Presenter presenter;

    TextView textName,textCount,textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        textName = (TextView)findViewById(R.id.text_name);
        textCount = (TextView)findViewById(R.id.text_count);
        textInfo = (TextView)findViewById(R.id.text_info);


        presenter = new MVPPresenter();
        presenter.setView(this);
    }

    @Override
    public void updateView(Item item) {

        textName.setText(item.getName());
        textCount.setText(String.valueOf(item.getCount()));
        textInfo.setText(item.getInfo());
    }
}
