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

        //was going to do multiple adapters for different recycler cards changed my mind
//        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, scienceList);
//        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);
//        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, fruitList);

        // added in first category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.cohiba, R.drawable.cigars, "Cohiba", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.monte, R.drawable.cigars, "Montecristo", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.cigar, R.drawable.cigars, "Bolivar", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.cigar, R.drawable.cigars, "Partagás", adapter1));
        categoryItemList.add(new CategoryItem(1, R.drawable.cigar, R.drawable.cigars, "H. Upmann", adapter1));

//        // added in second category
//        List<CategoryItem> categoryItemList2 = new ArrayList<>();
//        categoryItemList2.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList2.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList2.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList2.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList2.add(new CategoryItem(1, R.drawable.cigar));
//
//        // added in 3rd category
//        List<CategoryItem> categoryItemList3 = new ArrayList<>();
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList3.add(new CategoryItem(1, R.drawable.cigar));
//
//        // added in 4th category
//        List<CategoryItem> categoryItemList4 = new ArrayList<>();
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList4.add(new CategoryItem(1, R.drawable.cigars));
//
//
//        // added in 5th category
//        List<CategoryItem> categoryItemList5 = new ArrayList<>();
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigars));
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigar));
//        categoryItemList5.add(new CategoryItem(1, R.drawable.cigar));
        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Cuban", categoryItemList));
//        allCategoryList.add(new AllCategory("Dominican", categoryItemList2));
//        allCategoryList.add(new AllCategory("Honduran", categoryItemList3));
//        allCategoryList.add(new AllCategory("Brazilian", categoryItemList4));
//        allCategoryList.add(new AllCategory("Cameroon", categoryItemList5));

        mainCategoryRecycler = view.findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(getContext(), allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);




        return view;
    }


}