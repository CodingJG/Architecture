package com.junnine.mac.android_architecture.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.junnine.mac.android_architecture.mvvm.MVVMViewModel;
import com.junnine.mac.android_architecture.R;
import com.junnine.mac.android_architecture.databinding.ActivityMvvmBinding;

public class MVVMActivity extends AppCompatActivity {


    //build.gradle(Module) android{ ... dataBinding {  enabled = true } } 추가.


    private MVVMViewModel mvvmViewModel = new MVVMViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMvvmBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_mvvm);
        binding.setModel(mvvmViewModel);

        mvvmViewModel.onCreate();
    }
}
