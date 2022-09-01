package com.mahar.recycleviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mahar.recycleviewapplication.adapters.LogoAdapter;
import com.mahar.recycleviewapplication.models.TeamLogo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv;
        rv=findViewById(R.id.rv);
        List<TeamLogo> teams=new ArrayList<>();
        teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/1200px-Real_Madrid_CF.svg.png",
                "Real Madrid"));
        teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/id/thumb/5/53/Arsenal_FC.svg/1200px-Arsenal_FC.svg.png",
                "Arsenal"));

        LogoAdapter adapter=new LogoAdapter(this,teams);
        rv.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
    }
}