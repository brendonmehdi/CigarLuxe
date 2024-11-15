package com.example.cigarluxe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        //so what i have to do is create multiple adapters for each section of the recycler view. that way i can make the list views in each parent reccycler show different images
        //below is an on click listener that controls which img is being displayed
        //the holder.getadapterpostion gets hold of each card in the recyclerview in other words each item in the nested rv



        //note that in order to switch which parent rv you want to select use and if statement on the int position see if its == to 0 and so on for as many AllCategory items you add in the ListFragment class
        //example if(position == 0){code here} // this would select the first item in the parent recycler in this case containing our cuban cigar information
        //below for recycler id 1
        if (categoryItemList.get(0).getItemId() == 1) {
            //card 1
            if (holder.getAdapterPosition() == 0) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutcohiba);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money4);
                                break;
                        }

                    }
                });
                //card 2
            } else if (holder.getAdapterPosition() == 1) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutmonte);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength2);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 3
            }else if (holder.getAdapterPosition() == 2) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutbolivar);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength4);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money2);
                                break;
                        }

                    }
                });
                //card 4
            }else if (holder.getAdapterPosition() == 3){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutpartagas);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money2);
                                break;
                        }

                    }
                });
                //card 5
            }else if (holder.getAdapterPosition() == 4){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutupman);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength2);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money2);
                                break;
                        }

                    }
                });
            }
            //below for recycler 2
        }else if (categoryItemList.get(0).getItemId() == 2){
            //card 1
            if (holder.getAdapterPosition() == 0) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutopus);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money4);
                                break;
                        }

                    }
                });
                //card 2
            } else if (holder.getAdapterPosition() == 1) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutdavidoff);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money4);
                                break;
                        }

                    }
                });
                //card 3
            }else if (holder.getAdapterPosition() == 2){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutflor);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength4);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 4
            }else if (holder.getAdapterPosition() == 3){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutashton);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength4);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 5
            }else if (holder.getAdapterPosition() == 4){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutromeo);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
            }
        }else if (categoryItemList.get(0).getItemId() == 3){
            //card 1
            if (holder.getAdapterPosition() == 0) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutcao);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 2
            } else if (holder.getAdapterPosition() == 1) {
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutalec);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 3
            }else if (holder.getAdapterPosition() == 2){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutvilliger);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 4
            }else if (holder.getAdapterPosition() == 3){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutkristoff);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
                //card 5
            }else if (holder.getAdapterPosition() == 4){
                holder.infoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        switch (position) {
                            case 0:
                                holder.infoImage.setImageResource(R.drawable.aboutnub);
                                break;
                            case 1:
                                holder.infoImage.setImageResource(R.drawable.strength3);
                                break;
                            default:
                                holder.infoImage.setImageResource(R.drawable.money3);
                                break;
                        }

                    }
                });
            }
        }

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
