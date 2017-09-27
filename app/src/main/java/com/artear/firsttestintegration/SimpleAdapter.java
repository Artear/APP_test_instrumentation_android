package com.artear.firsttestintegration;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleVH> {

    private List<User> users;

    SimpleAdapter(List<User> users){
        this.users = users;
    }

    @Override
    public SimpleVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new SimpleVH(view);
    }

    @Override
    public void onBindViewHolder(SimpleVH holder, int position) {
        User user = users.get(position);
        holder.nameUserTextView.setText(user.getName());
        holder.emailUserTextView.setText(user.getEmail());
    }

    void addNewUser(User user){
        users.add(user);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
