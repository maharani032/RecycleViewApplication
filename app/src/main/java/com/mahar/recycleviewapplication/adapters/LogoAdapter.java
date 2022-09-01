package com.mahar.recycleviewapplication.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mahar.recycleviewapplication.R;
import com.mahar.recycleviewapplication.models.TeamLogo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LogoAdapter extends RecyclerView.Adapter<LogoAdapter.ViewHolder> {
    private Context context;
    private List<TeamLogo> items;

    public LogoAdapter(Context context, List<TeamLogo> items) {
        this.context = context;
        this.items = items;
    }


    @NonNull
    @Override
    public LogoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.card_teamlogo,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LogoAdapter.ViewHolder holder, int position) {
        TeamLogo item=items.get(position);
        holder.nameLogo.setText(item.getName());
//        set Image dengan piccaso
        Picasso.get().load(item.getLogo()).into(holder.imgLogo);
    }

    @Override
    public int getItemCount() {
        return (items!=null)? items.size():0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgLogo;
        TextView nameLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo=itemView.findViewById(R.id.imgLogo);
            nameLogo=itemView.findViewById(R.id.nameLogo);

        }
    }
}
