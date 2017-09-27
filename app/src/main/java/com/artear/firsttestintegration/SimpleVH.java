package com.artear.firsttestintegration;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class SimpleVH extends RecyclerView.ViewHolder{

    public TextView nameUserTextView;
    public TextView emailUserTextView;

    public SimpleVH(View itemView) {
        super(itemView);
        nameUserTextView = (TextView) itemView.findViewById(R.id.name_user_item_list);
        emailUserTextView = (TextView) itemView.findViewById(R.id.email_user_item_list);
    }
}
