package com.example.mulyani.resepmakanan;

/**
 * Created by Mulyani on 10/3/2017.
 */

public class ModelResep {
    private int imgGambar;
    private String namaJudul;
    private String namaDeskripsi;
    private String bahanResep;
    private String caramembuat;

    public ModelResep(int imgGambar,
                      String namaJudul,
                      String namaDeskripsi,
                      String bahanResep,
                      String caramembuat){
        this.imgGambar = imgGambar;
        this.namaJudul = namaJudul;
        this.namaDeskripsi = namaDeskripsi;
        this.bahanResep = bahanResep;
        this.caramembuat = caramembuat;

    }

    public int getImgGambar(){
        return imgGambar;
    }

    public String getNamaJudul(){

        return namaJudul;
    }

    public String getNamaDeskripsi(){
        return namaDeskripsi;
    }

    public String getBahanResep(){
        return bahanResep;
    }

    public String getCaramembuat(){
        return caramembuat;
    }



}
