package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
//        DialogFragment dialogFragment = new DialogFragment();
//        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
//        dialogFragment.show(fragmentTransaction,"dialog");

//        DialogBox dialogBox = new DialogBox();
//        dialogBox.onCreateDialog(Bundle.EMPTY);

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        final View viewroot = inflater.inflate(R.layout.fragment_dialog_box, null);

        alertDialog
                .setIcon(R.drawable.ic_launcher_background)
                .setTitle(R.string.PleaseInputUserNameAndPassword)
                .setPositiveButton(R.string.login,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                String username = ((EditText) viewroot.findViewById(R.id.username)).getText().toString();
                                String password = ((EditText) viewroot.findViewById(R.id.password)).getText().toString();
                                if (!username.equals("abc") || !password.equals("123")) {
                                    CharSequence text = "登录失败";
                                    Toast toast = Toast.makeText(MainActivity.this.getApplicationContext(), text, Toast.LENGTH_SHORT);
                                    toast.setGravity(Gravity.END | Gravity.CENTER, 0, 0);
                                    toast.show();
                                } else {
                                    CharSequence text = "登录成功";
                                    Toast toast = Toast.makeText(MainActivity.this.getApplicationContext(), text, Toast.LENGTH_SHORT);
                                    toast.setGravity(Gravity.END | Gravity.CENTER, 0, 0);
                                    toast.show();
                                }

                            }
                        })
                .setNegativeButton(R.string.cancel,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
        alertDialog.setView(viewroot);
        alertDialog.show();
    }

    public void popUpWindow(View view) {

    }

}
