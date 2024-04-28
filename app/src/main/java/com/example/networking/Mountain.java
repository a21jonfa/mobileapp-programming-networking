package com.example.networking;

public class Mountain extends RecyclerViewItem {

    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;
    private String wiki;
    private String img;

    public Mountain(String ID, String name, String type, String company, String location, String category, int size, int cost, String wiki, String img) {
        super(ID);
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.size = size;
        this.cost = cost;
        this.wiki = wiki;
        this.img = img;
    }
}
