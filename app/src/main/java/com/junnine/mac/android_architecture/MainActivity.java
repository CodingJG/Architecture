package com.junnine.mac.android_architecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.junnine.mac.android_architecture.mvc.MVCActivity;
import com.junnine.mac.android_architecture.mvp.MVPActivity;
import com.junnine.mac.android_architecture.mvvm.MVVMActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_mvc).setOnClickListener(this);
        findViewById(R.id.btn_mvp).setOnClickListener(this);
        findViewById(R.id.btn_mvvm).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_mvc:
                Intent intentMVC = new Intent(getApplicationContext(),MVCActivity.class);
                startActivity(intentMVC);
                break;

            case R.id.btn_mvp:
                Intent intentMVP = new Intent(getApplicationContext(),MVPActivity.class);
                startActivity(intentMVP);
                break;

            case R.id.btn_mvvm:
                Intent intentMVVM = new Intent(getApplicationContext(),MVVMActivity.class);
                startActivity(intentMVVM);

                break;

        }

    }
}
