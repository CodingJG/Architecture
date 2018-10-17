package com.junnine.mac.android_architecture.mvvm;


import android.databinding.ObservableField;

import com.junnine.mac.android_architecture.Model.Item;

public class MVVMViewModel implements MVVMContract {

    public ObservableField<String> textName = new ObservableField<>(),
            textCount = new ObservableField<>(), textInfo = new ObservableField<>();

    private Item item;

    public MVVMViewModel() {

        item = new Item("Box3",3,"MVVM Box");
    }

    @Override
    public void onCreate() {
        textName.set(item.getName());
        textCount.set(String.valueOf(item.getCount()));
        textInfo.set(item.getInfo());
    }
}
