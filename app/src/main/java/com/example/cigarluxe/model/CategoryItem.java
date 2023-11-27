package com.example.cigarluxe.model;

import android.widget.ListAdapter;

public class CategoryItem {

// here i am taking only image url. and this is as integer because i am using it from drawable file.

    Integer itemId;
    Integer imageUrl;
    Integer infoImageUrl;
    String title;
    ListAdapter infoAdapters;


    public CategoryItem(Integer itemId, Integer imageUrl, Integer infoImageUrl, String title, ListAdapter infoAdapters) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.infoImageUrl = infoImageUrl;
        this.title = title;
        this.infoAdapters = infoAdapters;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getInfoImageUrl() {
        return infoImageUrl;
    }

    public void setInfoImageUrl(Integer infoImageUrl) {
        this.infoImageUrl = infoImageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ListAdapter getInfoAdapters() {
        return infoAdapters;
    }

    public void setInfoAdapters(ListAdapter infoAdapters) {
        this.infoAdapters = infoAdapters;
    }
}
