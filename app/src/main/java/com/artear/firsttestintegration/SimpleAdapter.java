package com.artear.firsttestintegration;


import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleVH> {


    private List<User> users;

    SimpleAdapter(List<User> users){
        this.users = users;
    }

    @Override
    public SimpleVH onCreateViewHolder(ViewGroup parent, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(SimpleVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
