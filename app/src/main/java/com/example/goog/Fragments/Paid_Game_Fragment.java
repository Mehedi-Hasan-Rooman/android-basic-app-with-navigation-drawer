package com.example.goog.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goog.Adapters.Paid_Game_Adapter;
import com.example.goog.Model_Class.Paid_Game_Model;
import com.example.goog.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Paid_Game_Fragment extends Fragment {

    public ArrayList<Paid_Game_Model> paid_model_classArrayList;
    public RecyclerView recyclerView;
    public Paid_Game_Adapter adapter;


    public Paid_Game_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_paid__game_, container, false);

        ArraySetUp();

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new Paid_Game_Adapter(paid_model_classArrayList);
        recyclerView.setAdapter(adapter);




        return view;


    }

    private void ArraySetUp() {

        paid_model_classArrayList = new ArrayList<>();

        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame1, "Modern Combat 5 ", "Price: $10"));

        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame2, "NOVA 3: Freedom Edition ", "Price: $6.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame3, "Grand Theft Auto ", "Price: $4"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame4, "Limbo ", "Price: $4.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame5, "Machinarium ", "Price: $4.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame6, "Monument Valley ", "Price: $3.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame7, "Kingdom Rush ", "Price: $2.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame8, "HyperDevBox Studio", "Price: $12.60"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame9, "Five Nights at Freddy's ", "Price: $2.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame10, "NBA Jam ", "Price: $4.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame11, "Osmos HD", "Price: $2.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame12, "Out There", "Price: $3.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame13, " Riptide GP2", "Price: $2.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame14, "The Room ", "Price: $2.99"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame15, "Shadowrun Returns and Shadowrun Dra ", "Price: $2.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame16, "Star Wars: Knights of the Old  ", "Price: $4.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame17, "Terraria ", "Price: $4.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame18, "World of Goo ", "Price: $4.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame19, "XCOM: Enemy Within", "Price: $12.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame20, "Baldur's Gate ", "Price: $9.99 "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame21, " Dungeon hunter 3 Brave Trials", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame22, "New Star Soccer", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame23, "Brothers in Arms 3", "Price: Free(Now)"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame24, "Home Run Battle 3D", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame25, " Bike Race Free ", "Price: Free(Now)"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame26, "Six Guns: Gang Showdown ", "Price: Free(Now)"));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame27, "Asphalt 8: Air Borne", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame28, "Frontline Commando ", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame29, "Gangstar Vegas ", "Price: Free(Now) "));
        paid_model_classArrayList.add(new Paid_Game_Model(R.drawable.paidgame30, "Commando Revenge ", "Price: Free(Now) "));


    }
}
