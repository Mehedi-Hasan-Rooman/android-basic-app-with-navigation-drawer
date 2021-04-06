package com.example.goog.Model_Class;

public class Trending_Game_Model {
    int game_image;
    String game_name;
    int game_descricption;


    public Trending_Game_Model(int game_image, String game_name, int game_descricption) {
        this.game_image = game_image;
        this.game_name = game_name;
        this.game_descricption = game_descricption;


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

    public int getGame_descricption() {
        return game_descricption;
    }

    public void setGame_descricption(int game_descricption) {
        this.game_descricption = game_descricption;
    }


}
