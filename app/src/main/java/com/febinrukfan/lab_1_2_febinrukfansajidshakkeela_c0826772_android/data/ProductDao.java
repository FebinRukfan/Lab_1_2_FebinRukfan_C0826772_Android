package com.febinrukfan.lab_1_2_febinrukfansajidshakkeela_c0826772_android.data;// Created by FebinRukfan on 10-02-2022.


import androidx.room.Dao;
import androidx.room.Query;


@Dao
public abstract class ProductDao {


    @Query("DELETE FROM product_table")
    public abstract void deleteAll();
}
