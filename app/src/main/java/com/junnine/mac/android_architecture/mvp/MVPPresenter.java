package com.junnine.mac.android_architecture.mvp;

import com.junnine.mac.android_architecture.Model.Item;

public class MVPPresenter implements MVPContract.Presenter {

    private MVPContract.View view;
    private Item item;

    @Override
    public void setView(MVPContract.View view) {

        this.view = view;
        this.item = new Item("Box2",2,"MVP BOX");
        view.updateView(item);
    }



}
