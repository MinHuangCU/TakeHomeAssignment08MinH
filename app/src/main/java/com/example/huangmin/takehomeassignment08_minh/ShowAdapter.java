package com.example.huangmin.takehomeassignment08_minh;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ShowAdapter extends RecyclerView.Adapter<ShowViewHolder> {
    private List<Time> times;
    private Context context;

    public ShowAdapter(List<Time> times, Context context) {
        this.times = times;
        this.context = context;
    }

    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_show, parent, false);
        return new ShowViewHolder(view, context);
    }


    @Override
    public void onBindViewHolder(ShowViewHolder holder, int showName) {
        Time time = times.get(showName);
        holder.showName.setText(time.showName);
        holder.availableTime.setText(time.availableTime);
        holder.showImage.setImageResource(time.showPhotoId);
        holder.stillAvailable = time.isStillAvailable();
    }

    @Override
    public int getItemCount() {
        return times.size();

    }
}
