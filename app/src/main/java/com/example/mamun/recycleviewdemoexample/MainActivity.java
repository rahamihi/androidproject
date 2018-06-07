package com.example.mamun.recycleviewdemoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private String[] country_name ={"Bangladesh","India","Pakistan","Sri Lanka","Nepal","Bhutan","Bangladesh","India","Pakistan","Sri Lanka","Nepal","Bhutan","Bangladesh","India","Pakistan","Sri Lanka","Nepal","Bhutan"};
    private String[] country_cap = {"Dhaka","Delhi","Islamabad","Colombo","Katmundu","Timpu","Dhaka","Delhi","Islamabad","Colombo","Katmundu","Timpu","Dhaka","Delhi","Islamabad","Colombo","Katmundu","Timpu"};
    private RecycleAdapter recycleAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView  = (RecyclerView) findViewById(R.id.recycleView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        recycleAdapter = new RecycleAdapter(country_name,country_cap);
        recyclerView.setAdapter(recycleAdapter);
        recyclerView.setHasFixedSize(true);





    }
}
