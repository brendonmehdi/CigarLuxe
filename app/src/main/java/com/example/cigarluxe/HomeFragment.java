package com.example.cigarluxe;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import info.hoang8f.widget.FButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        FButton mapbtn = view.findViewById(R.id.mapIntent);
        FButton emailbtn = view.findViewById(R.id.emailIntent);
        FButton callbtn = view.findViewById(R.id.callIntent);
        mapbtn.setButtonColor(getResources().getColor(R.color.fbutton_color_silver));
        emailbtn.setButtonColor(getResources().getColor(R.color.fbutton_color_silver));
        callbtn.setButtonColor(getResources().getColor(R.color.fbutton_color_silver));



//intent shows nearby cigar shops
        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Specify the search term
                String searchTerm = "cigar shop";

                // Create a Uri with the search term
                Uri IntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(searchTerm));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, IntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        emailbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"cigarluxe@luxe.com"}); // replace with the actual email address
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of the email");
                try {
                    startActivity(Intent.createChooser(intent, "Send Email"));
                } catch (ActivityNotFoundException e) {
                    // Handle case where no email app is available
                    Toast.makeText(getContext(), "No email app installed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "1234567890")); // replace with the actual phone number
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // Handle case where no dialer app is available
                    Toast.makeText(getContext(), "No dialer app installed", Toast.LENGTH_SHORT).show();
                }
            }
        });



        return view;
    }

}