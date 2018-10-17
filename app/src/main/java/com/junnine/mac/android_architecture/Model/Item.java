package com.junnine.mac.android_architecture.Model;

public class Item {

    String name;
    int count;
    String info;

    public Item(String name, int count, String info) {
        this.name = name;
        this.count = count;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
