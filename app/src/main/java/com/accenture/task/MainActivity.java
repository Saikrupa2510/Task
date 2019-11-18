package com.accenture.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.accenture.task.fragments.ButtonFragment;

public class MainActivity extends AppCompatActivity implements ButtonFragment.onButtonClickListner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            ButtonFragment buttonsFragement = new ButtonFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.frameLayout, buttonsFragement);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onclickbutton() {
        Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show();

    }
}