package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.jonmid.practicaborder.R.id.id_txv_food_title;
import static com.example.jonmid.practicaborder.R.id.id_txv_game_character;
import static com.example.jonmid.practicaborder.R.id.id_txv_game_gameseries;
import static com.example.jonmid.practicaborder.R.id.id_txv_game_name;

public class GameAdapter {
    List<GameAdapter> gameAdapterList = new ArrayList<>();
    Context context;

    public GameAdapter(List<Food> countryList, Context context) {
        this.gameAdapterList = gameAdapterList;
        this.context = context;
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);

        return viewHolder;

            }

    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.itemView,setText(gameAdapterList.get(position).getTitle());

    }
    public int getItemCount() {
        return gameAdapterList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewFood;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
    public GameAdapter(View item) {
        super(item);

        textViewName = (TextView) item.findViewById(id_txv_game_name);
        textViewCharacter = (TextView) item.findViewById(id_txv_game_character);
        textViewGameseries = (TextView) item.findViewById(id_txv_game_gameseries);
    }}


