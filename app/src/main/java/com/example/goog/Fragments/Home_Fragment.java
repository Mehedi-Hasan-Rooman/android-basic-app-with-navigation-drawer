package com.example.goog.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.goog.Dialogs.Adult_Dialog;
import com.example.goog.Dialogs.Dialog_Donate;
import com.example.goog.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Fragment extends Fragment {


    private Button Home_buttom;
    private Button Mobile_Game_Button;
    private Button Trending_Game_Button;
    private Button Paid_Game_Button;
    private Button Adult_Game_Button;
    private Button About_Button;
    private Button Donate_Button;


    public Home_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_, container, false);


        Donate_Button = view.findViewById(R.id.donate_us_button);
        About_Button = view.findViewById(R.id.about_button);
        Adult_Game_Button =view.findViewById(R.id.adult_game_button);
        Paid_Game_Button = view.findViewById(R.id.paid_game_button);
        Mobile_Game_Button = view.findViewById(R.id.mobile_game_button);
        Trending_Game_Button = view.findViewById(R.id.trending_button);
        Home_buttom = view.findViewById(R.id.home_button);


        Home_buttom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(getActivity(), "Home Button click", Toast.LENGTH_SHORT).show();
            }
        });

        Trending_Game_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              getFragmentManager().beginTransaction().replace(R.id.home_container, new Trending_Game_Fragment()).addToBackStack(null).commit();

                Toast.makeText(getActivity(), "Trending Game Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Mobile_Game_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFragmentManager().beginTransaction().replace(R.id.home_container, new Mobile_Game_Fragment()).addToBackStack(null).commit();
                Toast.makeText(getActivity(), "Mobile Game Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Paid_Game_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.home_container, new Paid_Game_Fragment()).addToBackStack(null).commit();
                Toast.makeText(getActivity(), "Premium Game Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Adult_Game_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Open_Adult_Dialog();
                Toast.makeText(getActivity(), "Adult Game Button Clicked ", Toast.LENGTH_SHORT).show();
            }
        });

        About_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.home_container, new About_Fragment()).addToBackStack(null).commit();
                Toast.makeText(getActivity(), "About App Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Donate_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                Toast.makeText(getActivity(), "Donate Us Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;

    }

    private void Open_Adult_Dialog() {
        Adult_Dialog adult_dialog = new Adult_Dialog();
        adult_dialog.show(getChildFragmentManager(),"Adult_Notice");
    }

    private void openDialog() {
        Dialog_Donate dialog_donate = new Dialog_Donate();
        dialog_donate.show(getChildFragmentManager(),"Donate Dialog");
    }
}
