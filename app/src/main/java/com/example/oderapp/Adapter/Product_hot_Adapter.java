package com.example.oderapp.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.oderapp.Model.Product_hot;
import com.example.oderapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Product_hot_Adapter extends RecyclerView.Adapter<Product_hot_Adapter.ViewHolder> {
    Context context;
    int layout;

    List<Product_hot> list;


    public Product_hot_Adapter(Context context, int layout, List<Product_hot> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(layout,null);
        Product_hot_Adapter.ViewHolder viewHolder = new Product_hot_Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Product_hot p = list.get(position);
        holder.txtproduct_hot.setText(p.getName());
        Picasso.get().load(p.getImage())
                .placeholder(R.drawable.loader)
                .error(R.drawable.noimage)
                .into(holder.imgproduct_hot);
    }

    @Override
    public int getItemCount() {
        if(list != null){
            return list.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView imgproduct_hot;
            TextView txtproduct_hot;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                imgproduct_hot = itemView.findViewById(R.id.imgproduct_hot);
                txtproduct_hot = itemView.findViewById(R.id.txtproduct_hot);
            }
        }
}
