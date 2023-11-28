package com.example.cigarluxe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PickerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickerFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PickerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PickerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PickerFragment newInstance(String param1, String param2) {
        PickerFragment fragment = new PickerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_picker, container, false);
        ImageView ranImage = view.findViewById(R.id.ranImage);
        Button ranButton = view.findViewById(R.id.randButton);

        Random ran = new Random();

        ranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ranNum = ran.nextInt(10);

                switch (ranNum){
                    case 0:
                        ranImage.setImageResource(R.drawable.cohiba);
                        break;
                    case 1:
                        ranImage.setImageResource(R.drawable.monte);
                        break;
                    case 2:
                        ranImage.setImageResource(R.drawable.davidoff);
                        break;
                    case 3:
                        ranImage.setImageResource(R.drawable.cao);
                        break;
                    case 4:
                        ranImage.setImageResource(R.drawable.upman);
                        break;
                    case 5:
                        ranImage.setImageResource(R.drawable.nub);
                        break;
                    case 6:
                        ranImage.setImageResource(R.drawable.ashton);
                        break;
                    case 7:
                        ranImage.setImageResource(R.drawable.bolivar);
                        break;
                    case 8:
                        ranImage.setImageResource(R.drawable.villiger);
                        break;
                    case 9:
                        ranImage.setImageResource(R.drawable.alec);
                        break;

                }
//                System.out.println(ranNum);
            }
        });



        return view;
    }
}