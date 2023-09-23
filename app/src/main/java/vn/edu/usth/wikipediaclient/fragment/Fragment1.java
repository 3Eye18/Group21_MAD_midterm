package vn.edu.usth.wikipediaclient.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import vn.edu.usth.wikipediaclient.MainActivity3;
import vn.edu.usth.wikipediaclient.MainActivity4;
import vn.edu.usth.wikipediaclient.R;

public class Fragment1 extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);

        Button buttonTin1 = view.findViewById(R.id.button_tin_1);
        Button buttonTin2 = view.findViewById(R.id.button_tin_2);
        Button buttonTin3 = view.findViewById(R.id.button_tin_3);

        buttonTin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity3.class);

                startActivity(intent);
            }
        });

        buttonTin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainActivity4.class);

                startActivity(intent);
            }
        });
        return view;
    }
}