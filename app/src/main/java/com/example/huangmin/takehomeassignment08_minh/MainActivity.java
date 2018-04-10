package com.example.huangmin.takehomeassignment08_minh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Time>times;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShowAdapter(times,this));
    }
    private void initialData(){
        times=new ArrayList<>();
        times.add(new Time(R.string.frozen,R.string.available_frozen,R.drawable.frozen,false));
        times.add(new Time(R.string.aladdin,R.string.available_aladdin,R.drawable.aladdin,true));
        times.add(new Time(R.string.anastasia,R.string.available_anastasia,R.drawable.anastasia,true));
        times.add(new Time(R.string.lion_king,R.string.available_lion_king,R.drawable.the_lion_king,false));
        times.add(new Time(R.string.beauty_and_the_beast,R.string.available_lion_king,R.drawable.beauty_and_the_beast,true));
        times.add(new Time(R.string.the_little_mermaid,R.string.available_little_mermaid,R.drawable.the_little_mermaid,true));

    }
}
