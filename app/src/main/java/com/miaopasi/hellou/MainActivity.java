package com.miaopasi.hellou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ItemStyle> fruitList = new ArrayList<ItemStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits(); // 初始化水果数据
        MainAdapter adapter = new MainAdapter(MainActivity.this, R.layout.activity_main_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        ItemStyle apple = new ItemStyle("Apple", R.mipmap.takepicguide_picsample_0);
        fruitList.add(apple);
        ItemStyle banana = new ItemStyle("Banana", R.mipmap.takepicguide_picsample_1);
        fruitList.add(banana);
        ItemStyle orange = new ItemStyle("Orange", R.mipmap.takepicguide_picsample_2);
        fruitList.add(orange);
        ItemStyle watermelon = new ItemStyle("Watermelon", R.mipmap.takepicguide_picsample_3);
        fruitList.add(watermelon);
        ItemStyle pear = new ItemStyle("Pear", R.mipmap.takepicguide_picsample_4);
        fruitList.add(pear);
        ItemStyle grape = new ItemStyle("Grape", R.mipmap.takepicguide_picsample_5);
        fruitList.add(grape);
        ItemStyle pineapple = new ItemStyle("Pineapple", R.mipmap.takepicguide_picsample_6);
        fruitList.add(pineapple);
        ItemStyle strawberry = new ItemStyle("Strawberry", R.mipmap.takepicguide_picsample_7);
        fruitList.add(strawberry);
        ItemStyle cherry = new ItemStyle("Cherry", R.mipmap.takepicguide_picsample_10);
        fruitList.add(cherry);
        ItemStyle mango = new ItemStyle("Mango", R.mipmap.takepicguide_picsample_12);
        fruitList.add(mango);
    }
}