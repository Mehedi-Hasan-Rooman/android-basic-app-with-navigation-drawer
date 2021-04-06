package com.example.goog.Dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.goog.Fragments.Adult_Game_Fragment;
import com.example.goog.R;

public class Adult_Dialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Only For Adult,s")
                .setMessage("Only 18+ Person Allow \n If you Under 18 Please Leave Now ")
                .setIcon(R.drawable.ic_adult)
                .setPositiveButton("Yes I,m 18+", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getFragmentManager().beginTransaction().replace(R.id.home_container, new Adult_Game_Fragment()).addToBackStack(null).commit();

                    }
                })
                .setNegativeButton("Leave", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
