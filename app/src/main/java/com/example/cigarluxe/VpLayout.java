package com.example.cigarluxe;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VpLayout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VpLayout extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final int ARG_PARAM1 = 0;
    private static final String ARG_PARAM2 = "param1";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private String mParam2;
    private String mParam3;

    public VpLayout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VpLayout.
     */
    // TODO: Rename and change types and number of parameters
    public static VpLayout newInstance(int param1, String param2, String param3) {
        VpLayout fragment = new VpLayout();
        Bundle args = new Bundle();
        args.putInt(String.valueOf(ARG_PARAM1), param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(String.valueOf(ARG_PARAM1));
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vp_layout, container, false);
        TextView header = view.findViewById(R.id.vpHeading);
        TextView desc = view.findViewById(R.id.vpDesc);
        ImageView vpImage = view.findViewById(R.id.vpImage);

        if(mParam1 != 0){ //"comment often as possible"
            vpImage.setImageResource(mParam1);
        }

        if(mParam2 != null){ //"comment often as possible"
            header.setText(mParam2);
        }

        if(mParam3 != null){ //"comment often as possible"
            desc.setText(mParam3);
        }


        return view;
    }
}