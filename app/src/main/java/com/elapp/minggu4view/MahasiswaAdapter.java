package com.elapp.minggu4view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.ViewHolder holder, int position) {
        holder.txNama.setText(dataList.get(position).getNama());
        holder.txNohp.setText(dataList.get(position).getNoHp());
        holder.txNpm.setText(dataList.get(position).getNpm());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNpm, txNohp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView.findViewById(R.id.tx_nama_mahasiswa);
            txNpm = itemView.findViewById(R.id.tx_npm_mahasiswa);
            txNohp = itemView.findViewById(R.id.tx_nohp_mahasiswa);
        }
    }
}
