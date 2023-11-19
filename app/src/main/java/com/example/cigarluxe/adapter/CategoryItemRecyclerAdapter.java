package com.example.cigarluxe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cigarluxe.R;
import com.example.cigarluxe.model.CategoryItem;


import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.child_rv_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {
//getting information from the categoryitem model
            holder.itemImage.setImageResource(categoryItemList.get(position).getImageUrl());
            holder.infoImage.setImageResource(categoryItemList.get(position).getInfoImageUrl());
            holder.title.setText(categoryItemList.get(position).getTitle());
            holder.infoList.setAdapter(categoryItemList.get(position).getInfoAdapters());

            //next step is to make the images change based on the click of the listview
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        ImageView infoImage;
        TextView title;
        ListView infoList;


        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            infoImage = itemView.findViewById(R.id.info_image);
            title = itemView.findViewById(R.id.childText);
            infoList = itemView.findViewById(R.id.list_child);

        }
    }

}
