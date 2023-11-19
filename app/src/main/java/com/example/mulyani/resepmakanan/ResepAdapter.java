package com.example.mulyani.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Mulyani on 10/3/2017.
 */

public class ResepAdapter extends RecyclerView.Adapter
<ResepAdapter.ResepViewHolder> {
    private Context context;
    private ArrayList<ModelResep>resep;

    public ResepAdapter(Context context, ArrayList<ModelResep> resep){
        this.context = context;
        this.resep = resep;
    }

    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listresep,parent,false);

        return new ResepViewHolder(view);
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder{
        ImageView imgGambar;
        TextView namaJudul;
        TextView namaDeskripsi;

        public ResepViewHolder(View itemView){
            super(itemView);
            imgGambar = (ImageView)itemView.findViewById(R.id.gambar);
            namaJudul = (TextView)itemView.findViewById(R.id.txt_judul);
            namaDeskripsi = (TextView)itemView.findViewById(R.id.txt_deskripsi);
        }
    }

    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder,int position) {
        holder.imgGambar.setImageResource(resep.get(position).getImgGambar());
        holder.namaJudul.setText(resep.get(position).getNamaJudul());
        holder.namaDeskripsi.setText(resep.get(position).getNamaDeskripsi());

        holder.namaJudul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, RincianActivity.class);

                pindah.putExtra("namaJudul",resep.get(position).getNamaJudul());
                pindah.putExtra("imgGambar",resep.get(position).getImgGambar());
                pindah.putExtra("bahanResep",resep.get(position).getBahanResep());
                pindah.putExtra("caramembuat",resep.get(position).getCaramembuat());
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resep.size();
    }


}
