package com.example.goog.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goog.Adapters.Trending_Game_Adapter;
import com.example.goog.R;
import com.example.goog.Model_Class.Trending_Game_Model;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Trending_Game_Fragment extends Fragment {






    public Trending_Game_Fragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    ArrayList<Trending_Game_Model> trending_modelArrayList;
    Trending_Game_Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_trending__game_, container, false);

        ArrayDataSetup();


        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new Trending_Game_Adapter(trending_modelArrayList);
        recyclerView.setAdapter(adapter);


        return view;
    }



    private void ArrayDataSetup() {
        trending_modelArrayList = new ArrayList<>();
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game1,"PUBG Mobile",R.string.game1));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game2,"Call of Duty: Mobile",R.string.game2));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game3,"Minecraft",R.string.game3));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game4,"Clash Of Clans",R.string.game4));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game5,"Free Fire",R.string.game5));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game6,"clash Royale",R.string.game6));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game7,"Fortnite",R.string.game7));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game8,"War of the Visions: Final Fantasy Brave Exvius",R.string.game8));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game9,"Pokémon Go",R.string.game9));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game10," Brawl Stars",R.string.game10));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game11,"Mobile Legends: Bang Bang",R.string.game11));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game12,"Roblox",R.string.game12));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game13,"Doodle Jump",R.string.game13));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game14,"Angry Birds 2",R.string.game14));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game15,"Boom Beach",R.string.game15));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game16,"Candy Crush Saga",R.string.game16));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game17,"8 Ball Pool",R.string.game17));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game18,"Marvel: Future Fight",R.string.game18));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game19,"Mario Kart Tour",R.string.game19));
        trending_modelArrayList.add(new Trending_Game_Model(R.drawable.game20,"Hay Day",R.string.game20));

    }


}
