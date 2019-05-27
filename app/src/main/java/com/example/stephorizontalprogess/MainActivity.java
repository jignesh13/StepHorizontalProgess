package com.example.stephorizontalprogess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MyHorizontalProgessView myHorizontalProgessView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myHorizontalProgessView=findViewById(R.id.myHorizontalProgessView);
    }

    public void updateProgess(View view) {
        Random random=new Random();
        myHorizontalProgessView.setCurrentprogess(random.nextInt(100));//max progress
    }
}
