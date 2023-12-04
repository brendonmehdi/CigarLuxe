package com.example.cigarluxe;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import info.hoang8f.widget.FButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PickerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickerFragment extends Fragment {
    ImageView ranImage;

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

        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getContext());
//below is settings for the text title
        boolean textSetting = sp.getBoolean("textSettings", false);
        TextView recyclerTitle = view.findViewById(R.id.genTitle);

        if (textSetting) {
            recyclerTitle.setTextSize(getResources().getDimension(R.dimen.text_bigger));

        } else {
            recyclerTitle.setTextSize(getResources().getDimension(R.dimen.text_norm));

        }


        ranImage = view.findViewById(R.id.ranImage);
        FButton ranButton = view.findViewById(R.id.randButton);
        ranButton.setButtonColor(getResources().getColor(R.color.fbutton_color_orange));



        Random ran = new Random();
        //handler to handle delaying images
        Handler handler = new Handler();



        ranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numberOfImages = 8;

                for (int i = 0; i < numberOfImages; i++) {
                    // Delay each image change by a certain interval
                    int finalI = i;
                    handler.postDelayed(new Runnable() {
                        @Override
                        //run holds code you want to execute after a certain delay
                        //in this case we generate a random number we do this 8 times and then we
                        //call the updateimage method we made
                        public void run() {
                            int ranNum = ran.nextInt(10);
                            updateImageView(ranNum);

                            if (finalI == numberOfImages -1){
                                popup(ranNum);
                            }
                        }
                    }, i * 200);//this is the second param which is the delay that is
                    //calculated based on the iteration index 'i' and a delay interval
                }

//                System.out.println(ranNum);


            }
        });

        return view;
    }

    private void updateImageView(int number){
        String suggestionMessage;
        switch (number){
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
    }

    public void popup(int number){
        String suggestionMessage;
        switch (number){
            case 0:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS COHIBA!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();

                break;
            case 1:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS MONTECRISTO!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 2:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS DAVIDOFF MILLENNIUM!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 3:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS CAO BRAZILLA GOL!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 4:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS H.UPMANN!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 5:

                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS NUB!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 6:
                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS ASHTON VSG!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 7:
                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS BOLIVAR!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 8:
                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS VILLIGER!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;
            case 9:
                //alert box
                suggestionMessage = "CONGRATS YOUR LUCKY PICK IS ALEC BRADLEY!";
                new AlertDialog.Builder(getActivity())
                        .setTitle("Cigar Picker")
                        .setMessage(suggestionMessage)
                        .setPositiveButton("OK", null)
                        .show();
                break;

        }

    }
}