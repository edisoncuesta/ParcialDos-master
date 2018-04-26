package com.example.jonmid.practicaborder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jonmid.practicaborder.Adapters.FoodAdapter;
import com.example.jonmid.practicaborder.Models.Food;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<MainActivity> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static List<MainActivity> getData(String content) throws Exception {

        FoodAdapter jsonArray = new FoodAdapter(content);
        List<Food> postList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++){

            FoodAdapter item = FoodAdapterArray.getMainActivityObject(i);

            Food food = new Food();
           Food.setTitle(item.getString("title"));

            postList.add(food);

        }

        return foodList;
    }

}
}
