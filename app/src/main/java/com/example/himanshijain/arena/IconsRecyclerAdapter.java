package com.example.himanshijain.arena;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Himanshi Jain on 2/26/2016.
 */
public class IconsRecyclerAdapter extends RecyclerView.Adapter<IconsRecyclerAdapter.ViewHolder> implements View.OnClickListener{

    ImageView imageView;
    ArrayList<String> data;
    Context context;
    //Animation animation;

    IconsRecyclerAdapter(ArrayList<String> data,Context context){
        this.context=context;
        this.data=data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.icon, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        imageView=(ImageView)holder.v.findViewById(R.id.micon);
//        animation= AnimationUtils.loadAnimation(context, R.anim.zoom_in);
//        animation.setDuration(1500);
        switch(position){
            case 0:imageView.setImageResource(R.drawable.athletics);
                   break;
            case 1:imageView.setImageResource(R.drawable.badminton);
                break;
            case 2:imageView.setImageResource(R.drawable.basketball);

                break;
            case 3:imageView.setImageResource(R.drawable.chess);
                break;
            case 4:imageView.setImageResource(R.drawable.cricket);
                break;
            case 5:imageView.setImageResource(R.drawable.football);
                break;
            case 6:imageView.setImageResource(R.drawable.tabletennis);
                break;
            case 7:imageView.setImageResource(R.drawable.tennis);
                break;
            default: break;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(0, 0, 0, 0);
//        imageView.startAnimation(animation);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onClick(View view) {

    }

    public  static class ViewHolder extends RecyclerView.ViewHolder {

        View v;
        public ViewHolder(View itemView) {
            super(itemView);
            v=itemView;
        }
    }
}
