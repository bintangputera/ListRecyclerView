package com.elapp.minggu4view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Bintang", "E41191570", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Tegar", "E41190868", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Rifjan", "E41190860", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Ipang", "E41192090", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Derby", "E41192010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Reza", "E41193010", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Zami", "E41194509", "123456789"));
    }
}