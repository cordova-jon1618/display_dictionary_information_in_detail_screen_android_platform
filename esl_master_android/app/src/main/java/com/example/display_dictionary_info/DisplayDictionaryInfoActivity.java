package com.example.display_dictionary_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;



public class DisplayDictionaryInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Fox");
        list.add("Smooth");
        list.add("Rider");
        list.add("Budge");
        list.add("Dairy");
        list.add("Classroom");
        list.add("Wisecrack");




        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    //clicked on Fox

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, FoxActivity.class));
                }else if(position==1){
                    //clicked smooth

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, SmoothActivity.class));
                }else if(position==2){
                    //clicked rider

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, RiderActivity.class));
                }else if(position==3){
                    //clicked budge

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, BudgeActivity.class));
                }else if(position==4){
                    //clicked dairy

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, DairyActivity.class));
                }else if(position==5){
                    //clicked Classroom

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, ClassroomActivity.class));
                }else if(position==6){
                    //clicked Classroom

                    startActivity(new Intent(DisplayDictionaryInfoActivity.this, WisecrackActivity.class));
                }
            }
        });


    }
}