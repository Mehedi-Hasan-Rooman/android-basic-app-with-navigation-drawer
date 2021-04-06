package com.example.goog.Model_Class;

public class Paid_Game_Model {

    int game_image;
    String game_name;
    String game_price;

    public Paid_Game_Model(int game_image, String game_name, String game_price) {
        this.game_image = game_image;
        this.game_name = game_name;
        this.game_price = game_price;
    }

    public int getGame_image() {
        return game_image;
    }

    public void setGame_image(int game_image) {
        this.game_image = game_image;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getGame_price() {
        return game_price;
    }

    public void setGame_price(String game_price) {
        this.game_price = game_price;
    }
}
