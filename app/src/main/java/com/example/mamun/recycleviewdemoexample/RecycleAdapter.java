package com.example.mamun.recycleviewdemoexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    private String[] country_name,country_cap;
    //private List<String>


    public RecycleAdapter(String[] country_name, String[] country_cap) {
        this.country_name = country_name;
        this.country_cap = country_cap;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);

        // now create a viewHolder instance to pass this layout to the ViewHolder
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.country_name.setText(country_name[position]);
        holder.country_cap.setText(country_cap[position]);

    }

    @Override
    public int getItemCount() {
        return country_cap.length;
    }

    // We need view Holder for holder view and bind data from data source

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView country_name,country_cap;
        public ViewHolder(View itemView) {
            super(itemView);

            country_name = (TextView)itemView.findViewById(R.id.country_name);
            country_cap = (TextView) itemView.findViewById(R.id.country_cap);

            //if click event then we have to implement here.
        }


    }


}
