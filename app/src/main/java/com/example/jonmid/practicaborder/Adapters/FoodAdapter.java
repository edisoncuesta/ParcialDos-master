package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.jonmid.practicaborder.R.id.id_txv_food_title;

public class FoodAdapter {

    List<FoodAdapter> foodList = new ArrayList<>();
    Context context;

    public FoodAdapter(List<Food> countryList, Context context) {
        this.foodList = foodList;
        this.context = context;

    public FoodAdapter(String content) {
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            // Obtener la vista (item.xml)
            View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

            // Pasar la vista (item.xml) al ViewHolder
            ViewHolder viewHolder = new ViewHolder(item);

            return viewHolder;
        }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.itemView.setText(foodList.get(position).getTitle());

    }
    public int getItemCount() {
        return foodList.size();
}
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewFood;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
        public FoodAdapter(String item) {
            super(item);

            textViewtitle = (TextView) item.findViewById(id_txv_food_title);
    }}
