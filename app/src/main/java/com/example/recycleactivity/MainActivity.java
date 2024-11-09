package com.example.recycleactivity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyBookData[] myBookData = new MyBookData[]{
                new MyBookData("Dunia Sophie", "JosteinGaarder", R.drawable.dunia_shopie),
                new MyBookData("Janji", "Tere Liye", R.drawable.janji),
                new MyBookData("Laut Bercerita", "Leila Chudori", R.drawable.laut_bercerita),
                new MyBookData("Namaku Alam", "Leila Chudori", R.drawable.namaku_alam),
                new MyBookData("Pulang-Pergi", "Tere Liye", R.drawable.pulang_pergi),
                new MyBookData("Rembulan Tenggelam Di Wajahmu", "Tere Liye", R.drawable.rembulan_tenggelam_diwajahmu),
        };

        MyBookAdapter myBookAdapter = new MyBookAdapter(myBookData, MainActivity.this);
        recyclerView.setAdapter(myBookAdapter);
    }
}