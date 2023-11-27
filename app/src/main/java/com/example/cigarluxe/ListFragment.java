package com.example.cigarluxe;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.cigarluxe.adapter.MainRecyclerAdapter;
import com.example.cigarluxe.model.AllCategory;
import com.example.cigarluxe.model.CategoryItem;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
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
        View view = inflater.inflate(R.layout.fragment_list, container, false);


        //here we will create the adapters for the listview
        String cigList[] = {"About", "Strength", "Cost"};

        //creating the listview adapters
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(getContext(), R.layout.lv_layout,R.id.lvText, cigList);






        // added in first category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.cohiba, R.drawable.aboutcohiba, "Cohiba", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.monte, R.drawable.aboutmonte, "Montecristo", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.bolivar, R.drawable.aboutbolivar, "Bolivar", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.partagas, R.drawable.aboutpartagas, "Partagás", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.upman, R.drawable.aboutupman, "H. Upmann", adapter1));

// Added in second category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(2, R.drawable.opus, R.drawable.aboutopus, "Opus X", adapter1));
        categoryItemList2.add(new CategoryItem(2, R.drawable.davidoff, R.drawable.aboutdavidoff, "Millennium", adapter1));
        categoryItemList2.add(new CategoryItem(2, R.drawable.ligero, R.drawable.aboutflor, "Ligero", adapter1));
        categoryItemList2.add(new CategoryItem(2, R.drawable.ashton, R.drawable.aboutashton, "Ashton", adapter1));
        categoryItemList2.add(new CategoryItem(2, R.drawable.romeo, R.drawable.aboutromeo, "Romeo", adapter1));

// Added in third category
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(3, R.drawable.cao, R.drawable.aboutcao, "CAO", adapter1));
        categoryItemList3.add(new CategoryItem(3, R.drawable.alec, R.drawable.aboutalec, "Bradley", adapter1));
        categoryItemList3.add(new CategoryItem(3, R.drawable.villiger, R.drawable.aboutvilliger, "Villiger", adapter1));
        categoryItemList3.add(new CategoryItem(3, R.drawable.kristoff, R.drawable.aboutkristoff, "Kristoff", adapter1));
        categoryItemList3.add(new CategoryItem(3, R.drawable.nub, R.drawable.aboutnub, "Nub", adapter1));



        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Cuban", categoryItemList));
        allCategoryList.add(new AllCategory("Dominican", categoryItemList2));
        allCategoryList.add(new AllCategory("Brazilian", categoryItemList3));



        mainCategoryRecycler = view.findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(getContext(), allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);




        return view;
    }


}