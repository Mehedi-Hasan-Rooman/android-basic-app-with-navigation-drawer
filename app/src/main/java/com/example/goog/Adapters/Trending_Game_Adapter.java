package com.example.goog.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goog.Model_Class.Trending_Game_Model;
import com.example.goog.R;

import java.util.ArrayList;

public class Trending_Game_Adapter extends RecyclerView.Adapter<Trending_Game_Adapter.ViewHolder> {

    ArrayList<Trending_Game_Model> trending_modelArrayList;

    public Trending_Game_Adapter(ArrayList<Trending_Game_Model> modelArrayList) {
        trending_modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.trending_item,parent,false);
        ViewHolder VH = new ViewHolder(view);

        return VH;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Trending_Game_Model current_item = trending_modelArrayList.get(position);

        holder.trending_game_image.setImageResource(current_item.getGame_image());
        holder.trending_game_name.setText(current_item.getGame_name());
        holder.trending_game_description.setText(current_item.getGame_descricption());

    }

    @Override
    public int getItemCount() {
        return trending_modelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView trending_game_image;
        TextView trending_game_name;
        TextView trending_game_description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            trending_game_image = itemView.findViewById(R.id.imageView);
            trending_game_name = itemView.findViewById(R.id.textView);
            trending_game_description = itemView.findViewById(R.id.textView2);
        }
    }
}
