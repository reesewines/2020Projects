package com.example.madfi.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.madfi.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    private TextView mFirstName; //instantiating the object it acts like a global variable
    private TextView mLastName; //creating a field variable or local variable
    private TextView mCity;
    private TextView mSchool;
    private TextView mBrother;
    private TextView mSister;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView mFirstName = root.findViewById(R.id.txtFirstName);
        final TextView mLastName = root.findViewById(R.id.txtLastName);
        final TextView mCity = root.findViewById(R.id.txtCity);
        final TextView mSchool = root.findViewById(R.id.txtSchool);
        final TextView mBrother = root.findViewById(R.id.txtBrother);
        final TextView mSister = root.findViewById(R.id.txtSister);
        final Button button = root.findViewById(R.id.btnSubmit);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String first = mFirstName.getText().toString(); //getText just gets the info out of TextView. toString makes it a string only
                String last = mLastName.getText().toString();
                String city = mCity.getText().toString();
                String school = mSchool.getText().toString();
                String brother = mBrother.getText().toString();
                String sister = mSister.getText().toString();

                int rF = (int) (Math.random() * first.length()); //Copied from VSC version
                int rL = (int) (Math.random() * last.length());
                int rC = (int) (Math.random() * city.length());
                int rS = (int) (Math.random() * school.length());
                int rB = (int) (Math.random() * brother.length());
                int rSi = (int) (Math.random() * sister.length());

                String sciFiFirst = first.substring(0, rF) + last.substring(rL);
                String sciFiLast = city.substring(0, rC) + school.substring(rS);
                String sciFiHome = brother.substring(0, rB) + sister.substring(rSi);

                TextView outputText = (TextView) root.findViewById(R.id.txtOutput);
                outputText.setText(sciFiFirst + " " + sciFiLast + "\nFrom\n" + sciFiHome); //append function is same as println same as \n
            }
        });
        return root;
    }
}
