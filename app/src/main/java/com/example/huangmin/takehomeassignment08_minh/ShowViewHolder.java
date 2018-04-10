package com.example.huangmin.takehomeassignment08_minh;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ShowViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView showName;
    public TextView availableTime;
    public ImageView showImage;
    public TextView price;
    public boolean stillAvailable;

    public ShowViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        showName=(TextView)itemView.findViewById(R.id.show_name);
        availableTime=(TextView)itemView.findViewById(R.id.available_time);
        showImage=(ImageView)itemView.findViewById(R.id.show_image);
        price=(TextView)itemView.findViewById(R.id.show_price);


        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (stillAvailable){
                    Toast.makeText(context,"Success Purchase",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context,"Sry, Tickets SOLD OUT",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }




}
