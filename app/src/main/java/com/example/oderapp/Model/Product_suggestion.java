package com.example.oderapp.Model;

public
class Product_suggestion {
    private  int id;
    private String name;
    private String image;
    private String Price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Product_suggestion(int id, String name, String image, String price) {
        this.id = id;
        this.name = name;
        this.image = image;
        Price = price;
    }
}
