package com.example.aababdulbasit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.aababdulbasit.model.Barang;
import com.example.aababdulbasit.model.BarangAdapter;

import java.util.ArrayList;
import java.util.List;

public class BarangActivity extends AppCompatActivity {
    private List<Barang> listBarang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        BarangAdapter adapter = new BarangAdapter(listBarang);
        recyclerView.setAdapter(adapter);

        // Tambahkan data barang ke list
        listBarang.add(new Barang("sejadah", 100000, R.drawable.sejadah));
        listBarang.add(new Barang("peci", 50000, R.drawable.peci));
        listBarang.add(new Barang("baju koko", 150000, R.drawable.bajukoko));
        listBarang.add(new Barang("sarung", 300000, R.drawable.sarung));
        listBarang.add(new Barang("mukena", 200000, R.drawable.mukena));

        // Beri tahu adapter bahwa data telah berubah
        adapter.notifyDataSetChanged();
    }
}
