package com.example.ritzycheeseburger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CheckBox mCheese, mTomato, mLettuce, mOnion, mPickle, mMustard, mKetchup;
    private TextView mResultTextView;
    private ArrayList<String> mResult;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCheese = findViewById(R.id.checkCheese);
        mTomato = findViewById(R.id.checkTomato);
        mLettuce = findViewById(R.id.checkLettuce);
        mOnion = findViewById(R.id.checkOnion);
        mPickle = findViewById(R.id.checkPickle);
        mMustard = findViewById(R.id.checkMustard);
        mKetchup = findViewById(R.id.checkKetchup);


        mResultTextView = findViewById(R.id.textAdded);
        mResult = new ArrayList<>();
        mButton = findViewById(R.id.button2);

        mCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mCheese.isChecked()){
                    mResult.add("Cheese");
                }
            }
        });

        mTomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mTomato.isChecked()){
                    mResult.add("Tomato");
                }
            }
        });

        mLettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mLettuce.isChecked()){
                    mResult.add("Lettuce");
                }
            }
        });

        mOnion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnion.isChecked()){
                    mResult.add("Onion");
                }
            }
        });

        mPickle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPickle.isChecked()){
                    mResult.add("Pickle");
                }
            }
        });

        mKetchup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mKetchup.isChecked()){
                    mResult.add("Ketchup");
                }
            }
        });

        mMustard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mMustard.isChecked()){
                    mResult.add("Mustard");
                }
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Items Added:").append("\n");
                for (String s:mResult){
                    stringBuilder.append(s).append("\n");
                 mResultTextView.setText(stringBuilder.toString());
                }
            }
        });

    }
}