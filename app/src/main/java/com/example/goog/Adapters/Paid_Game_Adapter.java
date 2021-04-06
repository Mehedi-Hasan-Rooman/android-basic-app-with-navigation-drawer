package com.example.goog.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goog.Model_Class.Paid_Game_Model;
import com.example.goog.R;

import java.util.ArrayList;

public class Paid_Game_Adapter extends RecyclerView.Adapter<Paid_Game_Adapter.ViewHolder> {

    ArrayList<Paid_Game_Model> paid_model_classArrayList;

    // Contrauctor for Adapter
    public Paid_Game_Adapter(ArrayList<Paid_Game_Model> paid_model_classArrayList) {
        this.paid_model_classArrayList = paid_model_classArrayList;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.paid_game_item,parent,false);

        ViewHolder VH = new ViewHolder(view);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Paid_Game_Model current_item = paid_model_classArrayList.get(position);
        holder.paid_game_image.setImageResource(current_item.getGame_image());
        holder.paid_game_name.setText(current_item.getGame_name());
        holder.paid_game_price.setText(current_item.getGame_price());
    }

    @Override
    public int getItemCount() {
        return paid_model_classArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView paid_game_image;
        TextView paid_game_name;
        TextView paid_game_price;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            paid_game_image = itemView.findViewById(R.id.paid_game_image);
            paid_game_name = itemView.findViewById(R.id.paid_game_name);
            paid_game_price = itemView.findViewById(R.id.paid_game_price);

        }
    }
}
