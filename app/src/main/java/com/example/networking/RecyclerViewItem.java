package com.example.networking;

public class RecyclerViewItem {
    String ID;

    public RecyclerViewItem(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return ID;
    }
}
