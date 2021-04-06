package com.example.goog.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.goog.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;


/**
 * A simple {@link Fragment} subclass.
 */
public class About_Fragment extends Fragment {

    private BottomSheetBehavior bottomSheetBehavior;
    private TextView textView_state;


    public About_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_about_, container, false);

        View bottomSheet = view.findViewById(R.id.Bottom_Sheet);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
        textView_state = view.findViewById(R.id.text_view_state);
        Button button_expend = view.findViewById(R.id.button_expend);
        Button button_collapes = view.findViewById(R.id.button_collapse);

        button_expend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        button_collapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

                switch (newState){
                    case BottomSheetBehavior.STATE_COLLAPSED:
                        textView_state.setText(" ***____****");
                        break;

                    case BottomSheetBehavior.STATE_DRAGGING:
                        textView_state.setText("You Dragging Now");
                        break;

                    case BottomSheetBehavior.STATE_EXPANDED:
                        textView_state.setText(" Data Expanded");
                        break;

                    case BottomSheetBehavior.STATE_HIDDEN:
                        textView_state.setText(" All Data Hidden Now");
                        break;

                    case BottomSheetBehavior.STATE_SETTLING:
                        textView_state.setText(" Settling*****");
                        break;
                }

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });

        return view;
    }
}
