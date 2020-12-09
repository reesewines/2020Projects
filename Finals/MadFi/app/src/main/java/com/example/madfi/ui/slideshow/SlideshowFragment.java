package com.example.madfi.ui.slideshow;

import android.os.Bundle;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.madfi.R;
import com.example.madfi.ui.gallery.GalleryViewModel;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    private TextView mAdj1;
    private TextView mAnimal;
    private TextView mName;
    private TextView mNoun;
    private TextView mAnimalNoise;
    private TextView mHangout;
    private TextView mBodyPart1;
    private TextView mFood;
    private TextView mVerb;
    private TextView mBodyPart2;
    private TextView mNumber;
    private TextView mBodyPart3;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        mAdj1 = (TextView) root.findViewById(R.id.txtadj1);
        mAnimal = (TextView) root.findViewById(R.id.txtAnimal);
        mName = (TextView) root.findViewById(R.id.txtName);
        mNoun = (TextView) root.findViewById(R.id.txtNoun);
        mAnimalNoise = (TextView) root.findViewById(R.id.txtAnimalSound);
        mHangout = (TextView) root.findViewById(R.id.txtHangout);
        mBodyPart1 = (TextView) root.findViewById(R.id.txtBodyPart1);
        mFood = (TextView) root.findViewById(R.id.txtFood);
        mVerb = (TextView) root.findViewById(R.id.txtVerb);
        mBodyPart2 = (TextView) root.findViewById(R.id.txtBodyPart2);
        mNumber = (TextView) root.findViewById(R.id.txtNumber1);
        mBodyPart3 = (TextView) root.findViewById(R.id.txtBodyPart3);
        final Button button = root.findViewById(R.id.btnSubmit);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String adj = mAdj1.getText().toString();
                String animal = mAnimal.getText().toString();
                String name = mName.getText().toString();
                String noun = mNoun.getText().toString();
                String noise = mAnimalNoise.getText().toString();
                String hangout = mHangout.getText().toString();
                String bodyPart1 = mBodyPart1.getText().toString();
                String food = mFood.getText().toString();
                String verb = mVerb.getText().toString();
                String bodyPart2 = mBodyPart2.getText().toString();
                String number = mNumber.getText().toString();
                String bodyPart3 = mBodyPart3.getText().toString();

                TextView outputText = (TextView) root.findViewById(R.id.txtOutput);
                outputText.setText(name+" is the best "+animal+" in the world.(S)he is quiet except when hungry or when (s)he wants to go play in "+hangout+" loves to eat "+food+", and will do tricks for a bite of it. This "+animal+" is a friendly "+animal+" who enjoys jumping up and sitting on my "+bodyPart1+". That makes me "+verb+". It's fun to watch "+name+" leap into the "+noun+" and spin in circles trying to catch (his/her) "+bodyPart2+". "+name+" likes to sleep a lot, and looks so "+adj+" while sleeping. One of my favorite things about "+name+" is (his/her) contented "+noise+". It is music to my ears.\n");
            }
        });
        return root;
    }
}
