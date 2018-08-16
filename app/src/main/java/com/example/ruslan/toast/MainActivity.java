package com.example.ruslan.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Toast toast = Toast.makeText(this, "Zhumabek Ruslan", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP, 0,160);
        toast.show();

    }
}