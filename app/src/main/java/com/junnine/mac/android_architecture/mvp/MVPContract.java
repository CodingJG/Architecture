package com.junnine.mac.android_architecture.mvp;

import com.junnine.mac.android_architecture.Model.Item;

public interface MVPContract {

    interface View{

        void updateView(Item item);

    }

    interface Presenter{

        void setView(View view);
    }
}
