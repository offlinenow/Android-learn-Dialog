package com.example.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class DialogBox extends DialogFragment {
    private ViewPager pager;
    private Bundle savedInstanceState;
    private Activity activities;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (getActivity()==null){
            this.activities=super.getActivity();
        }


    }


//    @Override
//    @NonNull
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
//        LayoutInflater inflater = LayoutInflater.from(getActivity());
//        View viewroot = inflater.inflate(R.layout.fragment_dialog_box, null);
//
//        alertDialog
//                .setIcon(R.drawable.ic_launcher_background)
//                .setTitle(R.string.PleaseInputUserNameAndPassword)
//                .setPositiveButton(R.string.login,
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                final String username = getDialog().findViewById(R.id.username).toString();
//                                final String password = ((EditText) getDialog().findViewById(R.id.password)).getText().toString();
//                                if (!username.equals("abc") || !password.equals("123")) {
//                                    CharSequence text = "登录失败";
//                                    Toast toast = Toast.makeText(getActivity().findViewById(R.id.button1).getContext(), text, Toast.LENGTH_SHORT);
//                                    toast.setGravity(Gravity.END | Gravity.CENTER, 0, 0);
//                                    toast.show();
//                                } else {
//                                    CharSequence text = "登录成功";
//                                    Toast toast = Toast.makeText(getActivity().findViewById(R.id.button1).getContext(), text, Toast.LENGTH_SHORT);
//                                    toast.setGravity(Gravity.END | Gravity.CENTER, 0, 0);
//                                    toast.show();
//                                }
//
//                            }
//                        })
//                .setNegativeButton(R.string.cancel,
//                        new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                DialogBox.this.getDialog().cancel();
//                            }
//                        });
//        alertDialog.setView(viewroot);
//        return alertDialog.create();
//    }
}

